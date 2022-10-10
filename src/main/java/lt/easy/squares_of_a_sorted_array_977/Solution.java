package lt.easy.squares_of_a_sorted_array_977;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(i -> (int) Math.pow(i, 2)).sorted().toArray();
    }
}
