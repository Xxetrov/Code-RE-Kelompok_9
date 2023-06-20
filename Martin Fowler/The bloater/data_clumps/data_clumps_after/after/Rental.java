package data_clumps.after;


public class Rental {
    private String name;
    private RentalPeriod rentalPeriod;

    public Rental(String name, RentalPeriod rentalPeriod) {
        this.name = name;
        this.rentalPeriod = rentalPeriod;
    }

    public String getLabel() {
        return name;
    }

    public RentalPeriod getRentalPeriod() {
        return rentalPeriod;
    }
}