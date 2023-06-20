package dead_code;

import java.util.*;

public class DiscountCalculator {
	public double setFinalPrice(int priceBefore) {
		
		double finalPrice=0;
		//Pada awal toko baju dibuka, diskon baju 20% hanya untuk pembayaran lebih dari 5000000
		if(priceBefore>5000000) {			
			finalPrice = priceBefore - (priceBefore*0.2);
		}
		//Setelah toko baju lumayan lama berdiri, pengunjung semakin sedikit dan diskon baju itu 10% untuk semua item
		finalPrice = priceBefore - (priceBefore*0.1);
		
		return finalPrice;
	}
}
