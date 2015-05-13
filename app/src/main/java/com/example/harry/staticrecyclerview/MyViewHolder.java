package com.example.harry.staticrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by harry on 4/12/15.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView tvCountry;
    public ImageView ivFlag;
    LinearLayout rlCard;
    View view;

    public MyViewHolder(View view){
        super(view);
        tvCountry = (TextView) view.findViewById(R.id.tvCountry);
        ivFlag = (ImageView) view.findViewById(R.id.ivFlag);
        rlCard = (LinearLayout) view.findViewById(R.id.rlCard);
        this.view = view;
    }
}
