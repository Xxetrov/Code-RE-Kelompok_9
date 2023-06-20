

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckoutHandler handler = new CheckoutHandler();

        handler.addItemToCart(new Item("Shirt", 25.0));
        handler.addItemToCart(new Item("Pants", 40.0));
        handler.addItemToCart(new Item("Hat", 15.0));
        
        printReceipt(handler);

        // Hitung harga dalam USD
        double totalPriceUSD = handler.calculateTotalPrice();
        System.out.println("Total price in USD: $" + String.format("%.2f", totalPriceUSD));

        // Ubah total harga ke EUR
        CurrencyConverter converter = new CurrencyConverter("EUR");
        double totalPriceEUR = converter.convert(totalPriceUSD);
        System.out.println("Total price in EUR: " + String.format("%.2f", totalPriceEUR));

        // Ubah total harga ke IDR
        double totalPriceIDR = handler.convertToCurrency(totalPriceUSD, "IDR");
        System.out.println("Total price in IDR: Rp " + String.format("%.0f", totalPriceIDR));
	}
	
	public static void printReceipt(CheckoutHandler handler) {
        System.out.println("-------------------");
        System.out.println("      RECEIPT      ");
        System.out.println("-------------------");
        for (Item item : handler.getCart()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("-------------------");
    }
}
