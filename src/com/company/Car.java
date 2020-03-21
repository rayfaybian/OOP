package com.company;

import java.util.Scanner;

public class Car {
    private String name;
    private String brand;
    private String model;
    private String serialNumber;
    private String color;
    private FuelTank myFueltank;
    private Engine myEngine;
    private int speed;
    private Horn myHorn;
    private double fuelIntake;
    private boolean turbo = false;
    Scanner pedal = new Scanner(System.in);


    public Car(String name, String brand, String model, String serialNumber, String color) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public void setMyFueltank(FuelTank fueltank) {
        this.myFueltank = fueltank;
    }

    public void setMyEngine(Engine engine) {
        this.myEngine = engine;
    }

    public void setMyHorn(Horn horn) {
        this.myHorn = horn;
    }

    public void drive() {
        if (speed < 100) {
            System.out.println("How fast do you want to go? (1-100%)");
            speed = pedal.nextInt();
            myEngine.revEngine();
            System.out.println("Accelerating to " + getSpeed() + "% speed.");
            myFueltank.consumeFuel(getFuelIntake());
        } else {
            System.out.println("You are already driving at maximum speed");
        }
    }//actual fuelintake depends on speed

    public double getFuelIntake() {
        if (!turbo) {
            fuelIntake = (speed * 0.01) * myEngine.getFuelConsumption();
        } else {
            fuelIntake = 1.1 * myEngine.getFuelConsumption();
        }
        return fuelIntake;
    } //fuelintake is higher when turboboost is active

    public double getRemainingRange() {
        return (double) Math.round((myFueltank.getAvailableFuel() / getFuelIntake()) * 100);
    }

    public void getCarStatus() {
        System.out.println(" - Current speed: " + getSpeed() + "% " +
                "\n - Fuel left: " + myFueltank.getAvailableFuel() + " Liters\n" +
                " - Remaining range at current speed approximately " + getRemainingRange() + " Kilometers.\n");
    }

    public void brake() {
        turbo = false;
        if (speed > 0) {
            System.out.println("Lower speed by how much percent? (1-100)");
            int brakes = pedal.nextInt();
            if (brakes > speed) {
                brakes = speed;
                System.out.println("Emergency braking! Full stop!");
            }else if(speed >100){
                brakes = brakes + 10;}
            speed = speed - brakes;
            if (speed == 0) {
                System.out.println("You stopped the car.");
            }
        } else {
            System.out.println("Car is not moving.");
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void turboMode() {
        if ((myFueltank.getCapacity() / 10) > myFueltank.getAvailableFuel()) {
            System.out.println("Not enough fuel to activate turbomode.");
        } else {
            System.out.println("Turbomode on!");
            speed = 110;
            turbo = true;
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println(myHorn.getMyRingtone());
        }
    }

    public void refuel() {
        myFueltank.refuel();
    }

    @Override
    public String toString() {
        return "\nSpecsheet for" + name + " :\n" +
                "\nBrand: " + brand +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nSerialnumber: " + serialNumber +
                myEngine.toString() +
                myFueltank.toString() +
                myHorn.toString();
    }
}
