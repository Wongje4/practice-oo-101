package com.oo101;

public class Vehicle {
    private final String name;

    private final int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String speedup(){
        return this.name+": speed up "+this.speed+"km/h";
    }
}
