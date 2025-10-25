package test.apps.demo.flower;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = new Flower(flower);
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.amount = amount;

    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public boolean contains(FlowerSpec spec) {
        return this.flower.getFlowerSpec().equals(spec);
    }

}