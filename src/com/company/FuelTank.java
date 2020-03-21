package com.company;

public class FuelTank {
    private double capacity;
    private double availableFuel;

    public FuelTank(int capacity) {
        this.capacity = capacity;
        this.availableFuel = capacity;
    }

    public void refuel() {
        this.availableFuel = capacity;
        System.out.println("\nFueltank refilled. " + availableFuel + " Liters available.\n");
    }

    public double getAvailableFuel(){
        return availableFuel;
    }

    public double getCapacity(){
        return capacity;
    }


    @Override
    public String toString() {
        return "\nFueltank capacity: " + capacity + " Liters" +
                "\nAvailableFuel: " + availableFuel + "Liters";
    }
    public void consumeFuel(double fuelintake){
        availableFuel = availableFuel - fuelintake;
    }
}
