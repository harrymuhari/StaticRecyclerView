package com.example.harry.staticrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by harry on 4/12/15.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView tvCountry;
    public ImageView ivFlag;
    RelativeLayout rlCard;
    View view;

    public MyViewHolder(View view){
        super(view);
        tvCountry = (TextView) view.findViewById(R.id.tvCountry);
        ivFlag = (ImageView) view.findViewById(R.id.ivFlag);
        rlCard = (RelativeLayout) view.findViewById(R.id.rlCard);
        this.view = view;
    }
}
