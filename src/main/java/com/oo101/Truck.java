package com.oo101;

public class Truck {
    private final String name;

    private final Integer speed;

    public Truck(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public String speedup(){
        return this.name+": speed up "+this.speed+"km/h";
    }
}
