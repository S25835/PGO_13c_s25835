package PGO_02;

public class Adress {
    private String county;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Adress(String county, String city, String street, int house, int flat) {
        // TODO make sure nothing from parameters is null
        if (county == null) {
            throw new RuntimeException("Adress need country name");
        }
        this.county = county;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "county='" + county + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", flat=" + flat +
                '}';
    }
}
