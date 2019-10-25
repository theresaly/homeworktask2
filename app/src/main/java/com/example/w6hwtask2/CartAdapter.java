package com.example.w6hwtask2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder>{

    private ArrayList<Food> foodsToAdapt;

    public void setData(ArrayList<Food> foodsToAdapt) {
        this.foodsToAdapt = foodsToAdapt;
    }

    @NonNull
    @Override
    public CartAdapter.CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart, parent, false);
        CartAdapter.CartViewHolder cartViewHolder = new CartAdapter.CartViewHolder(view);
        return cartViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.CartViewHolder holder, int position) {

        final Food foodAtPosition = foodsToAdapt.get(position);

        holder.foodName.setText(foodAtPosition.getFoodName());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, Cart.class);
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

    public static class CartViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView foodName;
        public TextView foodQuantity;
        public TextView foodPrice;

        public ImageView foodPhoto;

        public CartViewHolder(View v) {
            super(v);  // runs the constructor for the ViewHolder superclass
            view = v;
            foodName = v.findViewById(R.id.cart_name);
            foodQuantity = v.findViewById(R.id.cart_quantity);
            foodPrice = v.findViewById(R.id.cart_price);
            foodPhoto = v.findViewById(R.id.cart_photo);

        }
    }
}



/*class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView cart_name;
    public TextView cart_quantity;
    public TextView cart_price;
    public ImageView cart_photo;


    public void setCart_name(TextView cart_name) {
        this.cart_name = cart_name;
    }

    private AdapterView.OnItemClickListener itemClickListener;

    public CartViewHolder(View itemView) {
        super(itemView);
        cart_name = itemView.findViewById(R.id.cart_name);
        cart_quantity = itemView.findViewById(R.id.cart_quantity);
        cart_price = itemView.findViewById(R.id.cart_price);
        cart_photo = itemView.findViewById(R.id.foodPhoto);
    }

    public class CartAdapter extends RecyclerView.Adapter<CartViewHolder> {

        private List<Food> listData = new ArrayList<>();
        private Context context;

        public CartAdapter(List<Food> listData, Context context) {
            this.listData = listData;
            this.context = context;
        }


        @NonNull
        @Override
        public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(context);
            View itemView = inflater.inflate(R.layout.cart, parent, false);
            return new CartViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {

            //TextDrawable drawable = TextDrawable.builder().buildRound(" " + listData.get(position).getQuantity());
            //holder.cart_quantity.setImageResource(foodAtPosition.getImageDrawableId());
        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
*/


