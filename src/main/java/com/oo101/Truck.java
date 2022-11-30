package com.oo101;

public class Truck extends Vehicle{

    private Engine engine;
    public Truck(String name, Engine engine) {
        super(name, engine.getSpeed());
    }


}
