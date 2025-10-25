package test.apps.demo.flower;

import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_SEPAL = 10;
    private static final int MAX_AMOUNT = 10;

    public static void main(String[] args) {

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

        flowerStore.search(rose.getFlowerSpec());
    }
}