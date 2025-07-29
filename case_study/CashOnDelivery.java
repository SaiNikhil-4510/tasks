package case_study;

public class CashOnDelivery extends Payment {
    public CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment due on delivery: ₹" + amount);
    }
}