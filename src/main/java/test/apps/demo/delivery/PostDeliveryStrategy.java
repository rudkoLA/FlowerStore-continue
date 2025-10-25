package test.apps.demo.delivery;

public class PostDeliveryStrategy implements Delivery {
    static final int DHL_PRICE = 10;
    static final int PRICE_CUTOFF = 100;

    @Override
    public double deliver(double price) {
        if (price > PRICE_CUTOFF) {
            return 0;
        }

        return DHL_PRICE;
    }
}
