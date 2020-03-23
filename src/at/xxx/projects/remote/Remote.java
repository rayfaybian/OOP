package at.xxx.projects.remote;

public class Remote {
    private boolean isOn;
    private boolean hasPower;

    private Battery powerSource;

    public Remote(Battery powerSource) {
        this.powerSource = powerSource;
        hasPower = this.powerSource.getChargingStatus() > 0;
    }

    public void turnOn() {
        if (isOn && this.powerSource.getChargingStatus() > 0) {
            System.out.println("Device is already on!");
            powerSource.usePower();
        } else if (this.powerSource.getChargingStatus() > 0) {
            isOn = true;
            System.out.println("Turning on device.");
            powerSource.usePower();
        } else {
            hasPower = false;
            System.out.println("No Power! Please check battery.");
        }
    }

    public void turnOff() {
        if (!isOn && this.powerSource.getChargingStatus() > 0) {
            System.out.println("Device is already off!");
            powerSource.usePower();
        } else if(isOn && this.powerSource.getChargingStatus() > 0){
            isOn = false;
            System.out.println("Turning off device.");
            powerSource.usePower();
        } else {
            hasPower = false;
            System.out.println("No Power! Please check battery.");
        }
    }

    public int getBatteryStatus() {
        return this.powerSource.getChargingStatus();
    }
}
