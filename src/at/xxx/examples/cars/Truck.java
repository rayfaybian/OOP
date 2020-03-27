package at.xxx.examples.cars;

public class Truck extends Car {
   private Trailer myTrailer;





    public Truck(String model, String color, int maxSpeed, double basePrice,
                 double baseFuelConsumption, Producer producer, Engine engine,Trailer myTrailer) {
        super(model, color, maxSpeed, basePrice, baseFuelConsumption, producer, engine);
        this.myTrailer = myTrailer;
    }


    @Override
    public String toString() {
        return "Truck\n" +
                "\nProducer: " + getProducerName() +
                "\nModel: " + getModel() +
                getProducer() +
                getEngine() +
                "\nColor: " + getColor() +
                "\nMaxSpeed: " + getMaxSpeed() + " kph" +
                "\nMileage: " + getMileage() + " km" +
                "\nFuelconsumption: " +f1.format(getRealFuelConsumption()) + " l/100km" +
                "\nBasePrice: € " + f2.format(getBasePrice()) +
                "\nSellingPrice (after discount) : € " + f2.format(getSellingPrice()) + "\n"+
                myTrailer + "\n";
    }
}
