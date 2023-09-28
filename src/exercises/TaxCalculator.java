package exercises;

public class TaxCalculator {
    public void TaxCalculator_ () {

        double price = 350D;
        double tax = 150D;
        int quantity = 3;
        double total;

        total = price * quantity * tax;

        String message = "I want to buy " + quantity + " shirt!";

        System.out.println(message);
        System.out.println("Total cost with tax: " + total);

    }
}