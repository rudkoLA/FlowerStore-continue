package test.apps.demo.flower;

public class Item {

    private FlowerBucket flowerBucket;

    public Item() {
        this.flowerBucket = new FlowerBucket();
    }

    public Item(FlowerBucket flowerBucket) {
        this.flowerBucket = flowerBucket;
    }

    public FlowerBucket getFlowerBucket() {
        return flowerBucket;
    }

    public void setFlowerBucket(FlowerBucket flowerBucket) {
        this.flowerBucket = flowerBucket;
    }
}
