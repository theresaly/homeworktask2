package com.example.w6hwtask2;

public class Order {

    private String foodID;
    private String foodName;
    private String quantity;
    private String price;

    public Order(){

    }

    public Order(String foodID, String foodName, String quantity, String price) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getFoodID() {
        return foodID;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
