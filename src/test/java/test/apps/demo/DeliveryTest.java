package test.apps.demo;

import test.apps.demo.delivery.PostDeliveryStrategy;
import test.apps.demo.flower.*;
import test.apps.demo.payment.CreditCardPaymentStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DeliveryTest {
    static final double FLOWER_PRICE = 50;
    static final double SEPAL_LENGTH = 10;
    static final int FLOWER_COUNT = 2;
    static final double EXPECTED_PRICE = 105;

    @Test
    public void testPostDelivery() {
        Order order = new Order();

        order.setDelivery(new PostDeliveryStrategy());
        order.setPayment(new CreditCardPaymentStrategy());

        Item item = new Item();
        Flower flower = new Flower();

        flower.setPrice(FLOWER_PRICE);
        flower.setColor(FlowerColor.RED);
        flower.setFlowerType(FlowerType.TULIP);
        flower.setSepalLength(SEPAL_LENGTH);

        FlowerBucket flowerBucket1 = new FlowerBucket();
        FlowerPack flowerPack1 = new FlowerPack(flower, FLOWER_COUNT);

        flowerBucket1.add(flowerPack1);
        item.setFlowerBucket(flowerBucket1);
        order.addItem(item);

        assertEquals(EXPECTED_PRICE, order.getTotalPrice());
    }
}