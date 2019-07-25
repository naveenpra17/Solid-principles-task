package com.stackroute;

public class Car extends ToyBuilder{
    private int price=100;


    public int getPrice() {
        return price;
    }
    public void move(){  //additional functionality
        System.out.println(super.getColor()+ "car is created and moving functionality is added." +
                "the price of car is" +getPrice());
    }
}
