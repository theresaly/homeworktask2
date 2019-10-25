package com.example.w6hwtask2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private ArrayList<Food> foodsToAdapt;

    public void setData(ArrayList<Food> foodsToAdapt) {
        this.foodsToAdapt = foodsToAdapt;
    }



    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food, parent, false);
        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        final Food foodAtPosition = foodsToAdapt.get(position);

        holder.foodName.setText(foodAtPosition.getFoodName());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, DetailFoodActivity.class);
                intent.putExtra("FoodID", foodAtPosition.getFoodID());
                context.startActivity(intent);

            }
        });

        holder.foodPhoto.setImageResource(foodAtPosition.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return foodsToAdapt.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView foodName;
        public ImageView foodPhoto;

        public FoodViewHolder(View v) {
            super(v);
            view = v;
            foodName = v.findViewById(R.id.foodName);
            foodPhoto = v.findViewById(R.id.foodPhoto);

        }
    }
}
