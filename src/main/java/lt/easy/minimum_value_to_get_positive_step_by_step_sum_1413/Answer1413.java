package lt.easy.minimum_value_to_get_positive_step_by_step_sum_1413;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Answer1413 {

    public int minStartValue(int[] nums) {
        AtomicInteger minValue = new AtomicInteger();
        AtomicInteger previousSum = new AtomicInteger();

        Arrays.stream(nums).forEach(num -> {
            previousSum.set(previousSum.get() + num);
            if (previousSum.get() < minValue.get()) minValue.set(previousSum.get());
        });


        if (minValue.get() >= 1) {
            return 1;
        } else {
            return 1 - minValue.get();
        }
    }
}
