package test.apps.demo.delivery;

public class PostDeliveryStrategy implements Delivery {
    final static int DHL_PRICE = 10;
    final static int PRICE_CUTOFF = 100;

    @Override
    public double deliver(double price) {
        if (price > PRICE_CUTOFF) {
            return 0;
        }

        return DHL_PRICE;
    }
}
