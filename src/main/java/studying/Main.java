package studying;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] products = {"Krabby patty deluxe", "Jelly fries", "Diet Dr.Kelp"};
        int[] prices = {12, 7, 3};
        Worker worker1 = new Worker("Spongebob", "SquarePants", products);

        System.out.println(worker1.getFirstName());
        System.out.println(worker1.getProducts());

        worker1.addProduct("Kelp Salad");
        System.out.println(worker1.getProducts()); //printed again to see the updated array

        worker1.setProductValue(3, "krabby nuggets"); //changing the value of something in my array
        System.out.println(worker1.getAveragePrice(prices));

        System.out.println(worker1);
    }
}
