package test.apps.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.apps.demo.payment.CreditCardPaymentStrategy;
import test.apps.demo.payment.PayPalPaymentStrategy;

@RestController
@RequestMapping("/flowerstore")
public class PaymentController {
    static final double PRICE = 100;

    @GetMapping("/payment")
    public List<Double> getPayments() {
        double creditCardPrice = new CreditCardPaymentStrategy().pay(PRICE);
        double payPalPrice = new PayPalPaymentStrategy().pay(PRICE);
        return List.of(creditCardPrice, payPalPrice);
    }
}
