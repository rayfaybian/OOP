package at.xxx.examples.cars;

public class Trailer {
    private int axles;
    private int length;
    private int wheels;

    public Trailer(int axles, int length, int wheels){
        this.axles = axles;
        this.length = length;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "\nTrailer:" +
                "\nLength:" + length +" meters" +
                "\nNumber of axles: " + axles +
                "\nNumber of wheels: " + wheels;
    }
}
