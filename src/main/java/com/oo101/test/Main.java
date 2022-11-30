package com.oo101.test;

import com.oo101.Car;
import com.oo101.Driver;
import com.oo101.Truck;
import com.oo101.Vehicle;

public class Main {
    public static void main(String[]args){
        Driver driver1 = new Driver(new Car("Cool Car", 30));
        System.out.println(driver1.speedup());

        Driver driver2 = new Driver(new Truck("Big Truck", 10));
        System.out.println(driver2.speedup());

    }
}

