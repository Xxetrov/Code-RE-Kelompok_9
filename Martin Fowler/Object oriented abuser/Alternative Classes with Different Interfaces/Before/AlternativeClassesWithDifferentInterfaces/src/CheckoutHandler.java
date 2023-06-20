
import java.util.ArrayList;

public class CheckoutHandler {
	private ArrayList<Item> shoppingCart;

    public CheckoutHandler() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addItemToCart(Item item) {
        shoppingCart.add(item);
    }

    public void removeItemFromCart(Item item) {
        shoppingCart.remove(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : shoppingCart) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public double convertToCurrency(double price, String currencyTo) {
        if (currencyTo.equalsIgnoreCase("EUR")) {
            return price * 0.9;
        } else if (currencyTo.equalsIgnoreCase("IDR")) {
            return price * 15000;
        } else {
            throw new IllegalArgumentException("Unrecognized currency: " + currencyTo);
        }
    }
    
    public ArrayList<Item> getCart() {
        return shoppingCart;
    }
}
