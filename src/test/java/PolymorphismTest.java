import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PolymorphismTest {

    @Test
    void carBaseAndSubclassBehaviorIsConsistent() {
        Car car = new Car(8, "Base car");
        Car ford = new Ford(6, "Ford Falcon");

        assertEquals("the car's engine is starting", car.startEngine());
        assertEquals("the car is accelerating", car.accelerate());
        assertEquals("the car is braking", car.brake());

        assertEquals("the car's engine is starting", ford.startEngine());
        assertEquals("the car is accelerating", ford.accelerate());
        assertEquals("the car is braking", ford.brake());
    }

    @Test
    void carSkeletonSubclassesExposeTheirOwnProperties() {
        CarSkeleton gas = new GasPoweredCar("Gas Car", "Petrol engine", 12.5, 6);
        CarSkeleton electric = new ElectricCar("EV", "Battery powered", 22.0, 80);
        CarSkeleton hybrid = new HybridCar("Hybrid", "Mixed drive", 15.0, 70);

        assertEquals("Gas Car", gas.getName());
        assertEquals("EV", electric.getName());
        assertEquals("Hybrid", hybrid.getName());

        assertTrue(gas.startEngine().contains("gas"));
        assertTrue(electric.startEngine().contains("electric"));
        assertTrue(hybrid.startEngine().contains("hybrid"));
    }
}
