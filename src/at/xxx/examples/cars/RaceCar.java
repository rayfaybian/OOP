package at.xxx.examples.cars;

public class RaceCar extends Vehicle {
    private Racingteam racingteam;

    public RaceCar(KIND kind, String model, String color, int maxSpeed, double basePrice, double baseFuelConsumption,
                   Producer producer, Engine engine, Racingteam racingteam) {
        super(kind, model, color, maxSpeed, basePrice, baseFuelConsumption, producer, engine);
        this.racingteam = racingteam;
    }

    public Racingteam getRacingteam() {
        return racingteam;
    }

    @Override
    public String toString() {
        return  super.toString()
                + getRacingteam() + "\n";

    }
}
