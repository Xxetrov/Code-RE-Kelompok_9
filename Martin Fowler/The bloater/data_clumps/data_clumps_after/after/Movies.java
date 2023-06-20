package data_clumps.after;


public class Movies {
	private String movieName;
	private RentalPeriod rentalPeriod;

	public Movies(String movieName, RentalPeriod rentalPeriod) {
        this.movieName = movieName;
        this.rentalPeriod = rentalPeriod;
    }

	public String getMovieName() {
        return movieName;
    }

    public RentalPeriod getRentalPeriod() {
        return rentalPeriod;
    }

}

