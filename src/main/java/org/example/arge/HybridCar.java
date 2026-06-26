package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = 4;
    }

    @Override
    public String startEngine() {
        return "hybrid engine started for " + getName();
    }

    @Override
    public String drive() {
        return "Hybrid car driving with " + avgKmPerLitre + " km/L and " + batterySize + " kWh battery";
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
