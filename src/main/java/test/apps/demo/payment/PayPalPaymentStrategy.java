package test.apps.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    public static int priceTax = 5;

    public double pay(double price) {
        return priceTax;
    }
}
