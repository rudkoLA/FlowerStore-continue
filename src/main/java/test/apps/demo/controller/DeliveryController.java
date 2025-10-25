package test.apps.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.apps.demo.delivery.DHLDeliveryStrategy;
import test.apps.demo.delivery.PostDeliveryStrategy;

@RestController
@RequestMapping("/flowerstore")
public class DeliveryController {
    static final double PRICE = 120;

    @GetMapping("/delivery")
    public List<Double> getDeliveries() {
        double firstDelivery = new PostDeliveryStrategy().deliver((PRICE));
        double secondDelivery = new DHLDeliveryStrategy().deliver((PRICE));
        return List.of(firstDelivery, secondDelivery);
    }
}
