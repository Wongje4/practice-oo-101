package com.oo101;

import com.oo101.Engine;

public class Car extends Vehicle{

    private Engine engine;
    public Car(String name, Engine engine) {
        super(name, engine.getSpeed());
    }


}