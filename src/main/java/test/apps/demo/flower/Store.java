package test.apps.demo.flower;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Store {
    private List<FlowerBucket> buckets = new ArrayList<FlowerBucket>();

    public void addBucket(FlowerBucket flowerBucket) {
        buckets.add(flowerBucket);
    }

    public List<FlowerBucket> search(FlowerSpec spec) {
        List<FlowerBucket> results = new ArrayList<FlowerBucket>();

        for (FlowerBucket bucket : buckets) {
            if (bucket.contains(spec)) {
                results.add(bucket);
            }
        }

        return results;
    }
}
