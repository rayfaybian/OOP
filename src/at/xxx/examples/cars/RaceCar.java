package at.xxx.examples.cars;

public class RaceCar extends Car {
    private Team team;

    public RaceCar(String model, String color, int maxSpeed, double basePrice, double baseFuelConsumption,
                   Producer producer, Engine engine,Team team) {
        super(model, color, maxSpeed, basePrice, baseFuelConsumption, producer, engine);
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Racecar\n" +
                getTeam() +
                "\nProducer: " + getProducerName() +
                "\nModel: " + getModel() +
                getProducer() +
                getEngine() +
                "\nColor: " + getColor() +
                "\nMaxSpeed: " + getMaxSpeed() + " kph" +
                "\nMileage: " + getMileage() + " km" +
                "\nFuelconsumption: " +f1.format(getRealFuelConsumption()) + " l/100km" +
                "\nBasePrice: € " + f2.format(getBasePrice()) +
                "\nSellingPrice (after discount) : € " + f2.format(getSellingPrice()) +
                "\n";
    }
}
