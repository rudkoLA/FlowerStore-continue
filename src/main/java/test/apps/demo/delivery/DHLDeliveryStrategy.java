package test.apps.demo.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public double deliver(double price) {
        return 10;
    }
}
