package lt.easy.range_sum_query_immutable_303;

public class NumArray {

    private final int[] prefixSum;
    private final int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        int sum = prefixSum[0];
        for (int idx = 1; idx < prefixSum.length; idx++) {
            sum += nums[idx];
            prefixSum[idx] = sum;
        }
    }
    public int sumRange(int left, int right) {
        return prefixSum[right] - prefixSum[left] + nums[left];
    }
}
