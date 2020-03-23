package at.xxx.projects.remote;

public class Main {
    public static void main(String[] args){


        Battery lithiumBattery = new Battery(100);
        Remote myRemote = new Remote(lithiumBattery);

        System.out.println("\nBattery status in %: " + myRemote.getBatteryStatus());
        System.out.println("\n");

        myRemote.turnOn();//turns on device
        myRemote.turnOn();//pressing button twice tells you device is already on
        System.out.println("\n");

        myRemote.turnOff();//turns off device
        myRemote.turnOff();//pressing button twice tells you device is already off

        System.out.println("\nBattery status in %: " + myRemote.getBatteryStatus());
        //battery loses power everytime the remote is used,

        lithiumBattery.setChargingStatus(0);//drain battery to see what happens when no powersource is available
        System.out.println("\nBattery status in %: " + myRemote.getBatteryStatus());
        System.out.println("\n");

        myRemote.turnOn();//turn on without power
        myRemote.turnOff();//turn off without power
    }
}
