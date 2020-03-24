package at.xxx.examples.cars;

public class Engine {
    public enum TYPE {DIESEL, GAS, ELECTRIC}

    private TYPE type;
    private int power;

    public Engine(TYPE type, int power) {
        this.type = type;
        this.power = power;
    }
    @Override
    public String toString() {
        return "\nEngine: " + type +
                "\nPower: " + power + " HP";
    }
}
