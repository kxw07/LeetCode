package lt.easy.most_frequent_number_following_key_in_an_array_2190;

import java.util.HashMap;
import java.util.Map;

public class Answer2190 {
    public int mostFrequent(int[] nums, int key) {
        int last = nums[0];
        int maxAppearTimes = 0;
        int maxAppearTimesTarget = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int idx = 1; idx < nums.length; idx++) {
            if (last == key) {
                final int appearTimes = map.compute(nums[idx], (k, v) -> {
                    if (v == null) {
                        return 1;
                    } else {
                        return ++v;
                    }
                });

                if (appearTimes > maxAppearTimes) {
                    maxAppearTimes = appearTimes;
                    maxAppearTimesTarget = nums[idx];
                }

            }

            last = nums[idx];
        }

        return maxAppearTimesTarget;
    }
}
