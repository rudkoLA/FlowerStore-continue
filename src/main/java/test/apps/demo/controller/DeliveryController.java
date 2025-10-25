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
    final static double DELIVER_TEST_PRICE = 120;

    @GetMapping("/delivery")
    public List<Double> getDeliveries() {
        double firstDelivery = new PostDeliveryStrategy().deliver((DELIVER_TEST_PRICE));
        double secondDelivery = new DHLDeliveryStrategy().deliver((DELIVER_TEST_PRICE));
        return List.of(firstDelivery, secondDelivery);
    }
}
