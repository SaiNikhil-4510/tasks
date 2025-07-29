package case_study;

import java.util.*;
import java.io.*;

public class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private boolean isCancelled = false;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void placeOrder(Payment payment, Discountable discountable) {
        if (isCancelled) {
            System.out.println("Cannot place order. It has been cancelled.");
            return;
        }

        customer.displayCustomer();
        products.forEach(p -> {
            p.displayDetails();
            if (!p.reduceStock()) {
                System.out.println("Failed to place order due to stock issues.");
                return;
            }
        });

        double discounted = discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);
        payment.amount = discounted;
        payment.processPayment();
    }

    public void cancelOrder() {
        isCancelled = true;
        System.out.println("Order cancelled.");
    }

    public void saveOrderToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Customer: " + customer.getName() + ", Email: " + customer.getEmail());
            for (Product product : products) {
                writer.write("\nProduct: " + product.name + " | Price: ₹" + product.price);
            }
            writer.write("\nTotal: ₹" + totalAmount);
            System.out.println("Order saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
