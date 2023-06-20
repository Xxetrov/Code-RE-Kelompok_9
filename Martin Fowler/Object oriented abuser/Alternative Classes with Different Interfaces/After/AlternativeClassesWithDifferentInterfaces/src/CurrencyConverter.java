
public class CurrencyConverter {
	private String currencyTo;
    public CurrencyConverter(){

    }

    public double convert(double price, String currencyTo) {
        if (currencyTo.equalsIgnoreCase("EUR")) {
            return price * 0.9;
        } else if (currencyTo.equalsIgnoreCase("IDR")) {
            return price * 15000;
        } else {
            throw new IllegalArgumentException("Unrecognized currency: " + currencyTo);
        }
    }
}
