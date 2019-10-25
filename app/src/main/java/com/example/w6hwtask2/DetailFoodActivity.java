package com.example.w6hwtask2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.room.Database;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailFoodActivity extends AppCompatActivity {

    private TextView foodName;
    private ImageView foodPhoto;
    private TextView price;
    private TextView description;
    private FloatingActionButton btnCart;
    private ElegantNumberButton numberButton;
    private TextView cartName;
    private TextView cartQuantity;
    private TextView cartPrice;
    private ImageView cartPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        //FoodDatabase.getFoodById(1).getFoodName();
        //TextView foodName = findViewById(R.id.foodName);
        //foodName.setText(FoodDatabase.getFoodById(1).getFoodName());


        // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        // Get the extra identified by "FoodID" that was put into the intent at the origin.
        int foodID = intent.getIntExtra("FoodID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        final Food food = FoodDatabase.getFoodById(foodID);

        foodName = findViewById(R.id.detailName);
        foodPhoto = findViewById(R.id.detailPhoto);
        price = findViewById(R.id.detailPrice);
        description = findViewById(R.id.detailDescription);
        btnCart = findViewById(R.id.btnCart);
        numberButton = findViewById(R.id.number_button);
        cartName = findViewById(R.id.cart_name);


        // Set the views to show the data of our object
        foodName.setText(food.getFoodName());
        foodPhoto.setImageResource(food.getImageDrawableId());
        price.setText(food.getPrice());
        description.setText(food.getDescription());

        btnCart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cartName.setText(food.getFoodName());
                cartPhoto.setImageResource(food.getImageDrawableId());
                cartPrice.setText(food.getPrice());
                cartQuantity.setText((CharSequence) numberButton);

            }

        });
    }
}
