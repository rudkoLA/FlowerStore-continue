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
    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of(new Flower(10, FlowerColor.RED, 5, FlowerType.ROSE),
                new Flower(4, FlowerColor.BLUE, 3, FlowerType.TULIP));
    }
}
