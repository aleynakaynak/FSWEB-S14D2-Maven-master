package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car baseCar = new Car(8, "Base car");
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        Car ford = new Ford(6, "Ford Falcon");
        Car holden = new Holden(6, "Holden Commodore");

        printCarBehavior(baseCar);
        printCarBehavior(mitsubishi);
        printCarBehavior(ford);
        printCarBehavior(holden);

        CarSkeleton gasPoweredCar = new GasPoweredCar("Gas Car", "Petrol engine", 12.5, 6);
        CarSkeleton electricCar = new ElectricCar("EV", "Battery powered", 22.0, 80);
        CarSkeleton hybridCar = new HybridCar("Hybrid", "Mixed drive", 15.0, 70);

        printSkeletonBehavior(gasPoweredCar);
        printSkeletonBehavior(electricCar);
        printSkeletonBehavior(hybridCar);
    }

    private static void printCarBehavior(Car car) {
        System.out.println(car.getClass().getSimpleName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }

    private static void printSkeletonBehavior(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.getClass().getSimpleName());
        System.out.println(carSkeleton.startEngine());
        System.out.println(carSkeleton.drive());
    }
}
