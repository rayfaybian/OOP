package at.xxx.projects.remote;

public class Battery {
    private int chargingStatus;

    public Battery(int chargingStatus){
        this.chargingStatus = chargingStatus;
    }

    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }
    public void usePower(){
        this.chargingStatus = this.chargingStatus - 1;
    }

    public int getChargingStatus(){
        return chargingStatus;
    }
}
