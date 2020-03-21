package com.company;

public class Engine {
    public enum Type {DIESEL,GAS}

    private String name;
    private Type type;
    private int horsepower;
    private int fuelConsumption; //per 100km at full speed

    public Engine(String name,Type type, int horsepower, int fuelConsumption) {
        this.name = name;
        this.type = type;
        this.horsepower = horsepower;
        this.fuelConsumption = fuelConsumption;
    }

    public void revEngine() {
        System.out.println("Vroom vroom!!!");

    }
    public int getFuelConsumption(){
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "\nEnginename: " + name +
                "\nEnginetype: " + type +
                "\nHorsepower: " + horsepower + " hp" +
                "\nMax. FuelConsumption: " + fuelConsumption + " l/100km" +
                " (" + fuelConsumption * 1.1 + " l/100 in turbomode)";

    }
}
