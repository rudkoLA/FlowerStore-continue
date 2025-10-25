package test.apps.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    static final int PRICE_TAX = 5;

    public double pay(double price) {
        return PRICE_TAX;
    }
}
