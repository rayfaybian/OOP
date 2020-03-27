package at.xxx.examples.cars;

public class Engine {
    public enum FUELTYPE {DIESEL, GAS, ELECTRIC}

    private FUELTYPE fueltype;
    private int power;

    public Engine(FUELTYPE type, int power) {
        this.fueltype = type;
        this.power = power;
    }
    @Override
    public String toString() {
        return "\nEngine: " + fueltype +
                "\nPower: " + power + " HP";
    }
}
