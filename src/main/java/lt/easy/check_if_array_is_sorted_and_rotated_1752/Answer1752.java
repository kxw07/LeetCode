package lt.easy.check_if_array_is_sorted_and_rotated_1752;

import java.util.Arrays;

public class Answer1752 {
    public boolean check(int[] nums) {
        int[] total = nums.clone();

        for (int idx = 1; idx < nums.length; idx++) {
            if (nums[idx] < nums[idx - 1]) {
                int[] after = Arrays.copyOfRange(nums, 0, idx);
                int[] before = Arrays.copyOfRange(nums, idx, nums.length);

                System.arraycopy(before, 0, total, 0, before.length);
                System.arraycopy(after, 0, total, before.length, after.length);

                break;
            }
        }

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        return Arrays.equals(total, sortedNums);
    }
}
