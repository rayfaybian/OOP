package at.xxx.examples.cars;

public class Racingteam {
    private String name;
    private String country;
    private String driver;

    public Racingteam(String name, String country, String driver) {
        this.name = name;
        this.country = country;
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return  "Team: " + getName() +
                "\nCountry: " + getCountry() +
                "\nDriver: " + getDriver();
    }
}
