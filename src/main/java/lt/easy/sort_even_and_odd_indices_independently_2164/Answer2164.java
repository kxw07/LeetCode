package lt.easy.sort_even_and_odd_indices_independently_2164;

import java.util.*;

public class Answer2164 {
    public int[] sortEvenOdd(int[] nums) {
        Integer[] odds = new Integer[nums.length / 2];
        Integer[] evens = new Integer[nums.length - nums.length / 2];

        int oddIndex = 0;
        int evenIndex = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            if (idx % 2 == 0) {
                evens[evenIndex++] = nums[idx];
            } else {
                odds[oddIndex++] = nums[idx];
            }
        }

        Arrays.sort(evens);
        Arrays.sort(odds, Comparator.reverseOrder());

        oddIndex = 0;
        evenIndex = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            if (idx % 2 == 0) {
                nums[idx] = evens[evenIndex++];
            } else {
                nums[idx] = odds[oddIndex++];
            }
        }

        return nums;
    }
}
