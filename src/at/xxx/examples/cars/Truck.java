package at.xxx.examples.cars;

public class Truck extends Car {
   private Trailer myTrailer;

    public Trailer getMyTrailer() {
        return myTrailer;
    }

    public Truck(String model, String color, int maxSpeed, double basePrice,
                 double baseFuelConsumption, Producer producer, Engine engine, Trailer myTrailer) {
        super(model, color, maxSpeed, basePrice, baseFuelConsumption, producer, engine);
        this.myTrailer = myTrailer;
    }


    @Override
    public String toString() {
        return  super.toString() +
                getMyTrailer() + "\n";
    }
}
