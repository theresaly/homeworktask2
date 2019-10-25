package com.example.w6hwtask2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Cart extends AppCompatActivity{

    private TextView foodName;
    private ImageView foodPhoto;
    private TextView price;
    private TextView description;
    private FloatingActionButton btnCart;
    private ElegantNumberButton numberButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);

        Intent intent = getIntent();

        int foodID = intent.getIntExtra("FoodID", 0);
        Food food = FoodDatabase.getFoodById(foodID);

        foodName = findViewById(R.id.detailName);
        foodPhoto = findViewById(R.id.detailPhoto);
        price = findViewById(R.id.detailPrice);

        foodName.setText(food.getFoodName());
        foodPhoto.setImageResource(food.getImageDrawableId());
        price.setText(food.getPrice());
        description.setText(food.getDescription());




    }
}
