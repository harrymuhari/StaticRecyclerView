package com.example.harry.staticrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by harry on 4/12/15.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder>{
    List<Item> items;
    Context context;

    public MyRecyclerViewAdapter(Context context, List<Item> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        /*important to pass the viewGroup as the parent and false for attachToRoot,
        otherwise the cardview won't respect some layout params: an issue i had with the cards layout_width
        */

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, final int i) {
        Item item = items.get(i);

        myViewHolder.tvCountry.setText(item.getCountry());
        myViewHolder.ivFlag.setImageResource(item.getFlag());

        myViewHolder.rlCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You clicked on card: " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return (items != null ? items.size() : 0);
    }
}
