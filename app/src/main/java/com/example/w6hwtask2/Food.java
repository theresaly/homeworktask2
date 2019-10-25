package com.example.w6hwtask2;

public class Food {

    private int foodID;
    private String foodName;
    private String description;
    private String price;
    private int imageDrawableId;


    public Food (int foodID, String foodName, String description, String price, int imageDrawableId){
        this.foodID = foodID;
        this.foodName = foodName;
        this.description = description;
        this.price = price;
        this.imageDrawableId = imageDrawableId;

    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

}
