package com.oo101.test;

import com.oo101.Car;
import com.oo101.Driver;
import com.oo101.Truck;
import com.oo101.ElectricEngine;
import com.oo101.GasolineEngine;
import com.oo101.Vehicle;

public class Main {
    public static void main(String[]args){
        Driver driver1 = new Driver(new Car("Car1", new ElectricEngine()));
        System.out.println(driver1.speedup());

        Driver driver2 = new Driver(new Car("Car2", new GasolineEngine()));
        System.out.println(driver2.speedup());

    }
}

