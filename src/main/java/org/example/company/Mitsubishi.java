package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " -> the car's engine is starting");
        return "the car's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " -> the car is accelerating");
        return "the car is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + " -> the car is braking");
        return "the car is braking";
    }
}
