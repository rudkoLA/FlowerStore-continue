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
    @GetMapping("/delivery")
    public List<Double> getDeliveries() {
        double delivery1 = new PostDeliveryStrategy().deliver((120));
        double delivery2 = new DHLDeliveryStrategy().deliver((120));
        return List.of(delivery1, delivery2);
    }
}
