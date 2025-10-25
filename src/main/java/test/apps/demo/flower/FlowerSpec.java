package test.apps.demo.flower;

import java.util.Objects;

import lombok.Getter;

@Getter
public class FlowerSpec {
    private double sepalLength;
    private String color;
    private FlowerType flowerType;

    public FlowerSpec(Flower other) {
        this.sepalLength = other.getSepalLength();
        this.color = other.getColor();
        this.flowerType = other.getFlowerType();
    }

    public FlowerSpec(double length, String color, FlowerType type) {
        this.sepalLength = length;
        this.color = color;
        this.flowerType = type;
    }

    public FlowerSpec(double length, FlowerColor color, FlowerType type) {
        this.sepalLength = length;
        this.color = color.toString();
        this.flowerType = type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FlowerSpec other)) {
            return false;
        }

        return Double.compare(this.sepalLength, other.sepalLength) == 0
                && this.color.equals(other.color)
                && this.flowerType == other.flowerType;
    }

    public int hashCode() {
        return Objects.hash(sepalLength, color, flowerType);
    }
}
