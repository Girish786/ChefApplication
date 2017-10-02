package com.example.amlidaz.chefapplication.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amlidaz.chefapplication.R;
import com.example.amlidaz.chefapplication.model.AcceptModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Amlidaz on 10/2/2017.
 */

public class NotificationFoodAdapterAccept extends RecyclerView.Adapter<NotificationFoodAdapterAccept.ViewHolder1> {
    Activity context_food;

    List<AcceptModel> acceptArraylist;

    public NotificationFoodAdapterAccept(Activity context_food,  List<AcceptModel> acceptArraylist) {
        this.context_food = context_food;
        this.acceptArraylist = acceptArraylist;
    }
    class ViewHolder1 extends RecyclerView.ViewHolder {

        public ImageView itemImage;
        public TextView nameFood;
        public TextView quantityFood;


        public ViewHolder1(View itemView) {
            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.Order_image);
            nameFood = (TextView) itemView.findViewById(R.id.Order_title);
            quantityFood = (TextView) itemView.findViewById(R.id.Order_quantity);
        }
    }
    @Override
    public ViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_cooking, parent, false);
        NotificationFoodAdapterAccept.ViewHolder1 viewHolder1 = new NotificationFoodAdapterAccept(context_food,acceptArraylist).new ViewHolder1(v);
        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder1 holder, int position) {
         AcceptModel acceptModel = acceptArraylist.get(position);
        holder.nameFood.setText(acceptModel.getTitles()[position]);
        Log.e("Mytag", "errror1" + acceptModel.getTitles()[position]);
        holder.quantityFood.setText(acceptModel.getDetails()[position]);
       Picasso.with(context_food).load(acceptModel.getImageUrl()[position]).into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return acceptArraylist.size();
    }
}
