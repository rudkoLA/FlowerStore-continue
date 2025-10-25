package test.apps.demo;

import test.apps.demo.delivery.PostDeliveryStrategy;
import test.apps.demo.flower.*;
import test.apps.demo.payment.CreditCardPaymentStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DeliveryTest {
    @Test
    public void testPostDelivery() {
        Order order = new Order();

        order.setDelivery(new PostDeliveryStrategy());
        order.setPayment(new CreditCardPaymentStrategy());

        Item item1 = new Item();
        Flower flower1 = new Flower();

        flower1.setPrice(50);
        flower1.setColor(FlowerColor.RED);
        flower1.setFlowerType(FlowerType.TULIP);
        flower1.setSepalLength(10);

        FlowerBucket flowerBucket1 = new FlowerBucket();
        FlowerPack flowerPack1 = new FlowerPack(flower1, 2);

        flowerBucket1.add(flowerPack1);
        item1.setFlowerBucket(flowerBucket1);
        order.addItem(item1);

        assertEquals(105, order.getTotalPrice());
    }
}