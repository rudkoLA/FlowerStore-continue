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
    @GetMapping("/payment")
    public List<Double> getPayments() {
        double price1 = new CreditCardPaymentStrategy().pay(100);
        double price2 = new PayPalPaymentStrategy().pay(100);
        return List.of(price1, price2);
    }
}
