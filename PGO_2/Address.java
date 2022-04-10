package PGO_2;

public class Address {
    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Address(String country, String city, String street, int house, int flat) {

        setCountry(country);
        setCity(city);
        setStreet(street);
        setHouse(house);
        setFlat(flat);
    }

    @Override
    public String toString() {
        return "Address{" +
                "county='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", flat=" + flat +
                '}';
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            throw new RuntimeException("Address need country name");
        }
        this.country = country;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            throw new RuntimeException("Address need city name");
        }
        this.city = city;
    }

    public void setStreet(String street) {
        if (street == null || street.isEmpty()) {
            throw new RuntimeException("Address need street name");
        }
        this.street = street;
    }

    public void setHouse(int house) {
        if(house <= 0) {
            throw new RuntimeException("House number needs to be more than 0");
        }
        this.house = house;
    }

    public void setFlat(int flat) {
        if(flat <= 0) {
            throw new RuntimeException("House number needs to be more than 0");
        }
        this.flat = flat;
    }
}
