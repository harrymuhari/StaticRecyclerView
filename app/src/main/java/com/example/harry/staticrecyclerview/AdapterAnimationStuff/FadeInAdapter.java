package com.example.harry.staticrecyclerview.AdapterAnimationStuff;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by fred on 5/13/15.
 */
public class FadeInAdapter extends AdapterAnimationWrapper {


    public FadeInAdapter(RecyclerView.Adapter adapter) {
        super(adapter);
    }

    @Override
    protected Animator getAnimator(View view) {
        return ObjectAnimator.ofFloat(view, "alpha", 0f, 1f);
    }
}
