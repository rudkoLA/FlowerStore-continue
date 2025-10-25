package test.apps.demo;

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

import test.apps.demo.flower.Flower;
import test.apps.demo.flower.FlowerBucket;
import test.apps.demo.flower.FlowerPack;
import test.apps.demo.flower.Rose;
import test.apps.demo.flower.Store;

import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private static final Random RANDOM = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_SEPAL = 10;
    private static final int MAX_AMOUNT = 10;

    @Test
    public void testStore() {
        Flower rose = new Rose();
        rose.setPrice(RANDOM.nextInt(MAX_PRICE));
        rose.setSepalLength(RANDOM.nextInt(MAX_SEPAL));

        FlowerPack fpackA = new FlowerPack(rose, RANDOM.nextInt(MAX_AMOUNT));
        FlowerPack fpackB = new FlowerPack(rose, RANDOM.nextInt(MAX_AMOUNT));
        FlowerPack fpackC = new FlowerPack(rose, RANDOM.nextInt(MAX_AMOUNT));
        FlowerPack fpackD = new FlowerPack(rose, RANDOM.nextInt(MAX_AMOUNT));

        FlowerBucket fBucket = new FlowerBucket();
        fBucket.add(fpackA);
        fBucket.add(fpackB);
        fBucket.add(fpackC);
        fBucket.add(fpackD);

        Store flowerStore = new Store();
        flowerStore.addBucket(fBucket);
        List<FlowerBucket> result = flowerStore.search(rose.getFlowerSpec());
        Assertions.assertEquals(result.size(), 1);
        Assertions.assertEquals(fBucket, result.get(0));
    }
}