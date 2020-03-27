package at.xxx.examples.cars;

import java.text.DecimalFormat;

public class Vehicle {
    public enum KIND{CAR,TRUCK,RACECAR}

    private KIND kind;
    private String model;
    private String color;
    private int maxSpeed;
    private double basePrice;
    private double baseFuelConsumption;
    private Producer producer;
    private Engine engine;
    private double sellingPrice;
    private int mileage;
    private double realFuelConsumption;

    public Vehicle(KIND kind, String model, String color, int maxSpeed, double basePrice, double baseFuelConsumption,
                   Producer producer, Engine engine) {
        this.kind = kind;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseFuelConsumption = baseFuelConsumption;
        this.realFuelConsumption = baseFuelConsumption;
        this.producer = producer;
        this.engine = engine;
        this.mileage = 0;
        setSellingPrice();
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
        if (getMileage() >= 50000) {
            increaseFuelConsumption();
        }
    }

    public void increaseFuelConsumption() {
        this.realFuelConsumption = baseFuelConsumption * 1.098;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getProducerName() {
        return producer.getName();
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getRealFuelConsumption() {
        return realFuelConsumption;
    }

    public void showRealFuelConsumption() {
        System.out.println("Fuelconsumption: " + String.format("%.2f", getRealFuelConsumption()) + " l/100km\n");
    }

    public double setSellingPrice() {
        this.sellingPrice = (((100 - this.producer.getDiscountInPercent()) / 100) * this.basePrice);
        return sellingPrice;
    }
    public KIND getKind(){
        return kind;
    }

    @Override
    public String toString() {
        return  "\nKind: " + getKind() +
                "\nProducer: " + getProducerName() +
                "\nModel: " + getModel() +
                getProducer() +
                getEngine() +
                "\nColor: " + getColor() +
                "\nMaxSpeed: " + getMaxSpeed() + " kph" +
                "\nMileage: " + getMileage() + " km" +
                "\nFuelconsumption: " + String.format("%.2f", getRealFuelConsumption()) + " l/100km" +
                "\nBasePrice: € " + String.format("%.0f", getBasePrice()) +
                "\nSellingPrice (after discount) : € " + String.format("%.0f", getSellingPrice()) + "\n";
    }
}
