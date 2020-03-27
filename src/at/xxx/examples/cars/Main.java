package at.xxx.examples.cars;

public class Main {

    public static void main(String[] args) {
        /*Mache ein neues Package at.xxx.examples.cars und implementiere folgende Aufgabenstellung
        (Achtung - neues Programm - nicht das alte Car Beispiel weiterverwenden)
        Ein Auto hat eine Farbe, eine Maximalgeschwindigkeit, einen Basispreis,
        Basisverbrauch und einen Hersteller und einen Motor.  Der Hersteller hat einen Namen und ein Herkunftsland.
        Jeder Hersteller gibt einen gewissen Rabatt. Dieser ist unterschiedlich je nach Hersteller.
        Der Rabatt wird in Prozent angegeben. Der Motor ist entweder Diesel oder Benzin und hat eine Leistung.
        Der Preis berechnet sich durch den Abzug des Rabatts vom Basispreis.
        Der Benzinverbrauch entspricht die ersten 50.000km dem Basisverbrauch. Danach wird er um 9.8 Prozent höher.*/


        Producer astonMartin = new Producer("Aston Martin", "Great Britain", 4);
        Engine v12 = new Engine(Engine.FUELTYPE.GAS, 725);
        Vehicle sportsCar = new Vehicle(Vehicle.KIND.CAR,"Aston Martin DBS Superleggera", "Silver",
                320, 295500,12.4, astonMartin, v12);

        Producer audi = new Producer("Audi", "Germany", 8);
        Engine v6 = new Engine(Engine.FUELTYPE.DIESEL, 160);
        Vehicle stationWagon = new Vehicle(Vehicle.KIND.CAR,"Audi A6 Kombi", "White",
                240, 48999,6.40, audi, v6);

        Producer tesla = new Producer("Tesla", "USA", 12);
        Engine p100D = new Engine(Engine.FUELTYPE.ELECTRIC, 611);
        Vehicle electricCar = new Vehicle(Vehicle.KIND.CAR,"Tesla Model S", "Black",
                260, 94880,0, tesla, p100D);

        Producer mercedes = new Producer("Daimler AG","Germany", 12);
        Engine v8TruckEngine = new Engine(Engine.FUELTYPE.DIESEL,272);
        Trailer bigTrailer = new Trailer(2,12,8);
        Truck bigTruck = new Truck(Vehicle.KIND.TRUCK,"Mercedes-Benz Actros","Blue",
                20,86750,22,mercedes,v8TruckEngine,bigTrailer);

        Producer redBull = new Producer("Red Bull Racing","Great Britain",0);
        Engine v6F1Engine = new Engine(Engine.FUELTYPE.GAS,850);
        Racingteam redBullRacing = new Racingteam("Red Bull Racing", "Austria","Max Verstappen");
        RaceCar rB16 = new RaceCar(Vehicle.KIND.RACECAR,"RB16","Midnight Blue",
                382,2600000,32, redBull,v6F1Engine,redBullRacing);



        //Aston Martin DBS Superleggera
        System.out.println(sportsCar.toString());
        sportsCar.setMileage(52827);//Fuelconsumption will increase by 9.80% when mileage >= 50000
        System.out.println("Mileage: " + sportsCar.getMileage() + " km");
        sportsCar.showRealFuelConsumption();

        //Audi A6 Stationwagon
        System.out.println(stationWagon.toString());
        stationWagon.setMileage(68492);//Fuelconsumption will increase by 9.80% when mileage >= 50000
        System.out.println("Mileage: " + stationWagon.getMileage() + " km");
        stationWagon.showRealFuelConsumption();

        //Tesla Model S
        System.out.println(electricCar.toString());
        electricCar.setMileage(51436);//Electric Car = no Fuelconsumption
        System.out.println("Mileage: " + electricCar.getMileage() + " km");
        electricCar.showRealFuelConsumption();

        //Mercedes-Benz Actros
        System.out.println(bigTruck.toString());
        bigTruck.setMileage(57564);//Fuelconsumption will increase by 9.80% when mileage >= 50000
        System.out.println("Mileage: " + bigTruck.getMileage() + " km");
        bigTruck.showRealFuelConsumption();

        //Formula 1 Car
        System.out.println(rB16.toString());
        rB16.setMileage(51245);//Fuelconsumption will increase by 9.80% when mileage >= 50000
        System.out.println("Mileage: " + rB16.getMileage() + " km");
        rB16.showRealFuelConsumption();

    }
}
