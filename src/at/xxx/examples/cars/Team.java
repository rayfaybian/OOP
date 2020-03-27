package at.xxx.examples.cars;

public class Team {
    private String name;
    private String country;
    private String driver;

    public Team(String name, String country, String driver) {
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
        return  "\nTeam: " + getName() +
                "\nCountry: " + getCountry() +
                "\nDriver: " + getDriver();
    }
}
