package at.xxx.projects.remote;

public class Remote {
    private boolean isOn;
    private boolean hasPower;

    private Battery powerSource;

    public Remote(Battery powerSource){
        this.powerSource = powerSource;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }
    public int getStatus(){

        return this.powerSource.getChargingStatus();

    }
}
