package com.stackroute;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Child  {
    public static void main(String args[]){

        System.out.println("Which type of toy you want");
        Scanner sc=new Scanner(System.in);
        String toyType=sc.nextLine(); //toy selector
        if(toyType.equals("train")) { //if train is selected
            Train train = new Train();
            System.out.println("Which colour you want to have");
            String color=sc.nextLine();
            train.setColor(color);
            train.move();
        }
        else if(toyType.equals("car")) { //if car is selecetd
            Car car = new Car();
            System.out.println("Which colour you want to have");
            String color=sc.nextLine();
            car.setColor(color);
            car.move();
        }
        else if(toyType.equals("flight")){ //if flight is selected
            Flight flight = new Flight();
            System.out.println("Which colour you want to have");
            String color=sc.nextLine();
            flight.setColor(color);
            flight.move();
            flight.fly();
        }

    }
}
