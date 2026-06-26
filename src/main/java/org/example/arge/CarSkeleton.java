package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine() {
        return "Starting engine";
    }

    public String drive() {
        return runEngine();
    }

    protected String runEngine() {
        return "Engine running";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
