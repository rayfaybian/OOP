package at.xxx.projects.remote;

public class Main {
    public static void main(String[] args){
        Battery lithiumBattery = new Battery(100);
        Remote myRemote = new Remote(lithiumBattery);

        System.out.println("Battery status in %: " + myRemote.getStatus());
    }
}
