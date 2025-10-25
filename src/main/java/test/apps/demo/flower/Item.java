package test.apps.demo.flower;

public class Item {

    private FlowerBucket flowerBucket;

    public Item() {
        this.flowerBucket = new FlowerBucket();
    }

    public Item(FlowerBucket bucket) {
        this.flowerBucket = bucket;
    }

    public FlowerBucket getFlowerBucket() {
        return flowerBucket;
    }

    public void setFlowerBucket(FlowerBucket bucket) {
        this.flowerBucket = bucket;
    }
}
