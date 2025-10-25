package test.apps.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price * 0.05;
    }
}
