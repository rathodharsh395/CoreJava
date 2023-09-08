package oops.Inheritance.relatonBetweenClasses;

import java.util.Scanner;

public class Car {
    boolean isEngineOk = false;
    Car(Engine e){
        isEngineOk= e.status;
    }
    Car(){

    }
    void run(){
        if(isEngineOk==true){
            System.out.println("car is running");
        }
        else{
            System.out.println("engine is off");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter true to start engine else false");
        Scanner hr= new Scanner(System.in);
        boolean choice = hr.nextBoolean();
        Engine key = new Engine(choice);
        Car car = new Car(key);
        car.run();
    }

}