package com.example.coldpizza;

public class Order {
    private String pizzaType;
    private int quantity;
    private double totalPrice;
    private String drinkType;
    private double drinkPrice;
    private String toppingType;
    private double toppingPrice;

    public Order(String pizzaType, int quantity, double totalPrice, String drinkType, double drinkPrice, String toppingType, double toppingPrice) {
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.drinkType = drinkType;
        this.drinkPrice = drinkPrice;
        this.toppingType = toppingType;
        this.toppingPrice = toppingPrice;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public String getToppingType() {
        return toppingType;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }
}
