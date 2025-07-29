package case_study;

import java.util.*;

public class ECommerceApp {
    public static void main(String[] args) {
        Product phone = new Electronics("P1001", "iPhone 16", 85000, 3, "Apple", 12);
        Product tshirt = new Clothing("C1002", "Polo T-shirt", 1499, 10, "M", "Cotton");
        Product book = new Book("B2001", "Java Programming", 899, 5, "Joshua Bloch", "Technology");
        Product chair = new Furniture("F3001", "Office Chair", 5499, 2, "Leather", "45x45x90cm");

        Customer customer = new Customer("Nikhil", "Nikhil@example.com");
        List<Product> products = Arrays.asList(phone, tshirt, book, chair);

        Order order = new Order(customer, products);

        // Lambda for 10% discount
        Discountable discount = price -> price * 0.9;

        // Choose payment method
        Payment payment = new CardPayment(0, "12345678910");

        // Place order
        order.placeOrder(payment, discount);

        // Optional: Save to file
        order.saveOrderToFile("order.txt");
       // order.saveOrderToFile("data/order.txt");


        // Cancel order (if needed)
        // order.cancelOrder();
    }
}
