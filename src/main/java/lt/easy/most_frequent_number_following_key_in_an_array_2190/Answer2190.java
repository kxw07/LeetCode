package lt.easy.most_frequent_number_following_key_in_an_array_2190;

import java.util.HashMap;
import java.util.Map;

public class Answer2190 {
    public int mostFrequent(int[] nums, int key) {
        int last = nums[0];
        int maxAppearTimes = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int idx = 1; idx < nums.length; idx++) {
            if (last == key) {
                final Integer appearTimes = map.compute(nums[idx], (k, v) -> {
                    if (v == null) {
                        return 1;
                    } else {
                        return ++v;
                    }
                });

                maxAppearTimes = Math.max(appearTimes, maxAppearTimes);
            }

            last = nums[idx];
        }

        final int a = maxAppearTimes;
        return map.entrySet().stream().filter(e -> e.getValue() == a).findFirst().orElseThrow().getKey();
    }
}
