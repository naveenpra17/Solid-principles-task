package com.stackroute;

public class Train extends ToyBuilder  {
    private int price=1000;


    public int getPrice() {
        return price;
    }
    public void move(){ //additional functionality
        System.out.println(super.getColor()+ "train is created and moving functionality is added" +
                "the price of train is" + getPrice());
    }


}
