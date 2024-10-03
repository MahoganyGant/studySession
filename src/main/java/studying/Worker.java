package studying;

import java.util.ArrayList;
import java.util.Arrays;

public class Worker {
    private String firstName;
    private String lastName;
    private ArrayList<String> products;

    public Worker(String firstName, String lastName, String[] products) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.products = new ArrayList<>(Arrays.asList(products)); //century.io for refrence parrallel array into arraylist
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    public int getNumProduct(){
        return products.size(); //
    }

    public String getProducts(){
        StringBuilder sb = new StringBuilder("Products \n"); //line is creating a new string builder
        for(int i = 0; i < products.size(); i++){ //looping through each product in products array

            sb.append("\t").append(products.get(i)).append("\n"); //add each product to the string one at a time
// backslash 'T' is tab function, append = add for string builder
        }
        return sb.toString();
    }

    public void addProduct(String product){
        products.add(product);
    }

    public void setProductValue(int indexPosition, String product){
        products.set(indexPosition,product); //w3schools java arraylist methods
    }

    public int getAveragePrice(int[]listOfPrices){
        int total = 0; // because it has to be initialized to use it
        for (int price : listOfPrices){
            total += price;
        }
        return total/ listOfPrices.length;
    }
@Override

    public String toString(){
       return "Name: " + firstName + " " + lastName + "\n" + "-> Sells these products: "
               + getProducts();
}

}
