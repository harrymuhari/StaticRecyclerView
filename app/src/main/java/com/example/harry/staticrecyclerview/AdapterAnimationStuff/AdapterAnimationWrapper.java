package com.example.harry.staticrecyclerview.AdapterAnimationStuff;

import android.animation.Animator;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fred on 5/13/15.
 *
 *This animates the onBindViewHolder process until you reach the end of your list, nothing more*/

public abstract class AdapterAnimationWrapper extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
    final int ANIM_DURATION = 200;
    int pos = -1;

    public AdapterAnimationWrapper(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter){
        this.adapter = adapter;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return adapter.onCreateViewHolder(parent, viewType);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        adapter.onBindViewHolder(holder, position);

        if(position > pos){
            Animator animator = getAnimator(holder.itemView);
            animator.setDuration(ANIM_DURATION);
            //a couple of interpolators added in appcompat 22.1
            animator.setInterpolator(new FastOutLinearInInterpolator());
            animator.start();
            pos = position;
        }

    }

    @Override
    public int getItemCount() {
        return adapter.getItemCount();
    }

    protected abstract Animator getAnimator(View view);

}
