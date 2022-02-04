package com.example.eatit.ViewHolder;

import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.eatit.Interface.ItemClickListener;



import androidx.recyclerview.widget.RecyclerView;

import com.example.eatit.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textMenuName;
    public ImageView imageView;

    private ItemClickListener itemClickListener;

    public MenuViewHolder( View itemView) {
        super(itemView);
        textMenuName = itemView.findViewById(R.id.menu_name);
        imageView = itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view){
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
}
