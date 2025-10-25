package test.apps.demo.delivery;

public class DHLDeliveryStrategy implements Delivery {
    final static int DHL_PRICE = 10;
    @Override
    public double deliver(double price) {
        return DHL_PRICE;
    }
}
