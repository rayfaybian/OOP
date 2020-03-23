package at.xxx.projects.remote;

public class Battery {
    private int chargingStatus;

    public Battery(int chargingStatus){
        this.chargingStatus = chargingStatus;
    }
    public int getChargingStatus(){
        return chargingStatus;
    }
}
