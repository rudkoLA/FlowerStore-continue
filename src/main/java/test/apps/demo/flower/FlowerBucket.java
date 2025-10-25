package test.apps.demo.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;

        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public boolean contains(FlowerSpec spec) {
        for (FlowerPack pack : flowerPacks) {
            if (pack.contains(spec)) {
                return true;
            }
        }

        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FlowerBucket)) {
            return false;
        }

        FlowerBucket other = (FlowerBucket) obj;

        return flowerPacks.equals(other.flowerPacks);
    }
}