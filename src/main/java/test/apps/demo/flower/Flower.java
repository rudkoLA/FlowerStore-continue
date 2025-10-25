package test.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Flower {
    private static final double DEFAULT_SEPAL_LENGTH = 10.0;
    private static final double DEFAULT_PRICE = 10.0;
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower() {
        sepalLength = DEFAULT_SEPAL_LENGTH;
        color = FlowerColor.WHITE;
        price = DEFAULT_PRICE;
        flowerType = FlowerType.CHAMOMILE;
    }

    public Flower(Flower flower) {
        sepalLength = flower.sepalLength;
        color = flower.color;
        price = flower.price;
        flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public FlowerSpec getFlowerSpec() {
        return new FlowerSpec(this);
    }
}