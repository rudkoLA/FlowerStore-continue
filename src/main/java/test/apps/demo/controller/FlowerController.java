package test.apps.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.apps.demo.flower.Flower;
import test.apps.demo.flower.FlowerColor;
import test.apps.demo.flower.FlowerType;

@RestController
@RequestMapping("/flowerstore")
public class FlowerController {
    static final double DEFAULT_SEPAL_LENGTH = 10;
    static final double DEFAULT_PRICE = 5;

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of(new Flower(DEFAULT_SEPAL_LENGTH, FlowerColor.RED,
                DEFAULT_PRICE, FlowerType.ROSE),
                new Flower(DEFAULT_SEPAL_LENGTH, FlowerColor.BLUE,
                        DEFAULT_PRICE, FlowerType.TULIP));
    }
}
