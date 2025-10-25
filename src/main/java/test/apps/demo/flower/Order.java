package test.apps.demo.flower;

import java.util.ArrayList;
import java.util.List;

import test.apps.demo.delivery.Delivery;
import test.apps.demo.payment.Payment;

public class Order {
    private List<Item> items = new ArrayList<Item>();

    private Payment payment;
    private Delivery delivery;

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getFlowerBucket().getPrice();
        }

        total += payment.pay(total);
        total += delivery.deliver(total);

        return total;
    }

    public void setDelivery(Delivery newDelivery) {
        this.delivery = newDelivery;
    }

    public void setPayment(Payment newPayment) {
        this.payment = newPayment;
    }
}
