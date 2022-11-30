package com.oo101;

public class Car {

    private final String name;

    private final Integer speed;

    public Car(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public String speedup(){
        return this.name+": speed up "+this.speed+"km/h";
    }



}