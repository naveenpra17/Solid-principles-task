package com.stackroute;

public class Flight extends ToyBuilder  {
    private int price=100888870;


    public int getPrice() {
        return price;
    }
    public void move(){ //additional functionality
        System.out.println(super.getColor()+ "flight is created and moving functionality is added." +
                "the price of flight is" +getPrice());
    }
    public void fly(){
        System.out.println("flight will fly");
    }//additional functionality
}
