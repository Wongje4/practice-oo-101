package com.oo101.test;

import com.oo101.Car;
import com.oo101.Truck;

public class Main {
    public static void main(String[]args){
        Car coolCar = new Car("Cool Car", 30);
        System.out.println(coolCar.speedup());

        Truck bigTruck = new Truck("Big Truck", 10);
        System.out.println(bigTruck.speedup());

    }
}

