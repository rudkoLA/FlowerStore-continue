package test.apps.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    final static double PRICE_TAX = 0.05;
    @Override
    public double pay(double price) {
        return price * PRICE_TAX;
    }
}
