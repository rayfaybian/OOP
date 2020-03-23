package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Business Limousine","Audi","A5","AUD4578","Black");

        Engine MiddleClassEngine = new Engine("Middle Class Engine", Engine.Type.DIESEL,
                280,15);
        car1.setMyEngine(MiddleClassEngine);

        FuelTank MidSizeFuelTank = new FuelTank(52);
        car1.setMyFueltank(MidSizeFuelTank);

        Horn myHorn = new Horn("Beep! Beep!");
        car1.setMyHorn(myHorn);

        RearMirror left = new RearMirror(50,"left");
        RearMirror middle = new RearMirror(100,"middle");
        RearMirror right = new RearMirror(50,"right");

        Tire tires = new Tire("Pirelli",225, Tire.KIND.SUMMER);

        car1.addMirror(left);
        car1.addMirror(middle);
        car1.addMirror(right);

        car1.addTires(tires);

        car1.drive();
        car1.getCarStatus();
        car1.brake();
        car1.getCarStatus();
        car1.honk(4);
        car1.drive();
        car1.getCarStatus();
        car1.refuel();
        car1.turboMode();
        car1.getCarStatus();
        car1.brake(); //Brakeforce will be increased by 10 to deactivate turbomode.
        car1.getCarStatus();
        System.out.println(car1.toString());


    }


}
