import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Total {

    private double totalPrice;
    private List<Item> items1;
    
    public Total(List<Item> items){
        
        this.totalPrice = 0.0;
        this.items1 = items;
       
    }
    public double getTotalPrice(){
        return totalPrice;
    }

    public void updateTotal(double price) {
        totalPrice += price;
    }
}
