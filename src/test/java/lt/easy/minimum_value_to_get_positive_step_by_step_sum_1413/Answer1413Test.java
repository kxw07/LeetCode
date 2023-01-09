package lt.easy.minimum_value_to_get_positive_step_by_step_sum_1413;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Answer1413Test {

    private final Answer1413 sut = new Answer1413();

    @Test
    public void example1() {
        int[] nums = {1, 2};
        Assertions.assertEquals(1, sut.minStartValue(nums));
    }

    @Test
    public void example2() {
        int[] nums = {1, -2, -3};
        Assertions.assertEquals(5, sut.minStartValue(nums));
    }

    @Test
    public void example3() {
        int[] nums = {-3, 2, -3, 4, 2};
        Assertions.assertEquals(5, sut.minStartValue(nums));
//        Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
//        step by step sum
//        startValue = 4 | startValue = 5 | nums
//                (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
//        (1 +2 ) = 3  | (2 +2 ) = 4    |   2
//        (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
//        (0 +4 ) = 4  | (1 +4 ) = 5    |   4
//        (4 +2 ) = 6  | (5 +2 ) = 7    |   2
    }

    @Test
    public void case1() {
        int[] nums = {2, 3, 5, -5, -1};
        Assertions.assertEquals(1, sut.minStartValue(nums));
    }
}