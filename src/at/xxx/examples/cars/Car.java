package at.xxx.examples.cars;

import java.text.DecimalFormat;

public class Car {
    DecimalFormat f1 = new DecimalFormat("#0.00");
    DecimalFormat f2 = new DecimalFormat("#0");

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

    public Car(String model, String color, int maxSpeed, double basePrice, double baseFuelConsumption,
               Producer producer, Engine engine) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseFuelConsumption = baseFuelConsumption;
        this.realFuelConsumption = baseFuelConsumption;
        this.producer = producer;
        this.engine = engine;
        this.sellingPrice = (((100 - this.producer.getDiscountInPercent()) / 100) * this.basePrice);
        this.mileage = 0;

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

    public void showRealFuelConsumption(){
        System.out.println("Fuelconsumption: " + f1.format(realFuelConsumption)+ " l/100km\n");
    }
    @Override
    public String toString() {
        return "Car: " +
                producer +
                engine +
                "\nColor: " + color +
                "\nMaxSpeed: " + maxSpeed + " kph" +
                "\nMileage: " + mileage + " km" +
                "\nFuelconsumption: " +f1.format(realFuelConsumption) + " l/100km" +
                "\nBasePrice: € " + f2.format(basePrice) +
                "\nSellingPrice: € " + f2.format(sellingPrice) + "\n";

    }
}
