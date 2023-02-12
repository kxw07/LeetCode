package lt.easy.range_sum_query_immutable_303;

import java.util.Arrays;

public class NumArray {

    private final int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        return Arrays.stream(Arrays.copyOfRange(nums, left, right + 1)).sum();
    }
}
