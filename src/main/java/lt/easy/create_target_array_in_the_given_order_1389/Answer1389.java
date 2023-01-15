package lt.easy.create_target_array_in_the_given_order_1389;

import java.util.ArrayList;
import java.util.List;

public class Answer1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        if (nums.length <= 1) return nums;

        List<Integer> result = new ArrayList<>(nums.length);
        for (int idx = 0; idx < nums.length; idx++) {
            result.add(index[idx], nums[idx]);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
