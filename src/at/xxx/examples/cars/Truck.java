package at.xxx.examples.cars;

public class Truck extends Vehicle {
    private Trailer myTrailer;

    public Truck(KIND kind, String model, String color, int maxSpeed, double basePrice,
                 double baseFuelConsumption, Producer producer, Engine engine, Trailer myTrailer) {
        super(kind, model, color, maxSpeed, basePrice, baseFuelConsumption, producer, engine);
        this.myTrailer = myTrailer;
    }

    public Trailer getMyTrailer() {
        return myTrailer;
    }

    @Override
    public String toString() {
        return super.toString() +
                getMyTrailer() + "\n";
    }
}
