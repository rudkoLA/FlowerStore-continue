package test.apps.demo.delivery;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public double deliver(double price) {
        if (price > 100) {
            return 0;
        }

        return 10;
    }
}
