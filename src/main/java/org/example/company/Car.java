package org.example.company;

import java.util.Objects;

public class Car {
    private final boolean engine;
    private final int cylinders;
    private final String name;
    private final int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " -> the car's engine is starting");
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " -> the car is accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName() + " -> the car is braking");
        return "the car is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }
}
