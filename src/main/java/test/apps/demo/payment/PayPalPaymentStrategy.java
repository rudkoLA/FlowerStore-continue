package test.apps.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    public double pay(double price) {
        return 3;
    }
}
