package com.example.w6hwtask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {

    public static Food getFoodById(int foodID){
        return foods.get(foodID);
    }


    public static ArrayList<Food> getAllFoods() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }

    private static final HashMap<Integer, Food> foods = new HashMap<>();


    static {
        foods.put(1, new Food(
                1,
                "Crispy Pork",
                "Delicious crispy skinned port with greens in our signature sauce!",
                "$11,00",
                R.drawable.food1
        ));

        foods.put(2, new Food(
                2,
                "Roasted Chicken",
                "Tender roast chicken with dips",
                "$12,00",
                R.drawable.food2
        ));

        foods.put(3, new Food(
                3,
                "Stir-fry Mushroom and Noodles",
                "Sauteed noodles and mushroom in our signature sauce",
                "$14,00",
                R.drawable.food3
        ));

        foods.put(4, new Food(
                4,
                "Papaya Salad",
                "Choose your level of spice with our delicious papaya salad!",
                "$13,00",
                R.drawable.food4
        ));

        foods.put(5, new Food(
                5,
                "Deep-fried Fish Cake",
                "Delicious fish entree to start the meal",
                "$9,00",
                R.drawable.food5
        ));

        foods.put(6, new Food(
                6,
                "Pork Sausages",
                "Pork sausages with dip",
                "$10,00",
                R.drawable.food6
        ));

        foods.put(7, new Food(
                7,
                "Hot and Sour Soup",
                "Signature hot and sour soup with mushroom and prawn",
                "$15,00",
                R.drawable.food7
        ));

        foods.put(8, new Food(
                8,
                "Green Chicken Curry",
                "Mild green chicken curry with vegetables",
                "$11,00",
                R.drawable.food8
        ));

        foods.put(9, new Food(
                9,
                "Fried Rice",
                "Try our thai fried rice with spam",
                "$11,00",
                R.drawable.food9
        ));

        foods.put(10, new Food(
                10,
                "Egg Fried Rice",
                "Delicious sauteed fried rice",
                "$11,00",
                R.drawable.food10
        ));

        foods.put(11, new Food(
                11,
                "Fried Fish",
                "Our delicious whole fish to share with the family!",
                "$11,00",
                R.drawable.food11
        ));

        foods.put(12, new Food(
                12,
                "Steamed Fish",
                "Steamed fish in chilli oil",
                "$11,00",
                R.drawable.food12
        ));

        foods.put(13, new Food(
                13,
                "Salt and Pepper Calamari",
                "Bestselling deep-fried calamari!",
                "$11,00",
                R.drawable.food13
        ));

        foods.put(14, new Food(
                14,
                "Tom Yum Soup",
                "Hot tom yum soup with prawn and mushroom",
                "$11,00",
                R.drawable.food14
        ));

        foods.put(15, new Food(
                15,
                "Deep-Fried Ice-Cream",
                "Signature vanilla fried ice-cream!",
                "$11,00",
                R.drawable.food15
        ));
    }


}
