package homework;

import java.util.Calendar;
import java.util.Date;

public class Sale {

    String productName = "Rice";
    double productPrice = 5;
    int qty = 20;
    double total = productPrice * qty;



    public void yardSaleWholeSale(String product, double price, int qty) {
        System.out.println("Name\tQty\t\tPrice\tTotal");
        System.out.println("----\t---\t\t-----\t-------");
        System.out.println(String.format(product + "\t" + qty + "\t\t" + "$%.2f" , price) + "\t" + String.format("$%.2f",total));
        System.out.println();
        System.out.println("\tThank you come again!!!");
        System.out.println();
        System.out.print("Purchased on: ");
        Date today = new Date();
        System.out.printf("%tA, %tB %td, %tY",today, today, today, today);
    }

}
