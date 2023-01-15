package lt.easy.create_target_array_in_the_given_order_1389;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer1389Test {
    private final Answer1389 sut = new Answer1389();

    @Test
    void example1() {
        int[] nums = {0, 1, 2, 3, 4}, index = {0, 1, 2, 2, 1};
        int[] expect = {0, 4, 1, 3, 2};

        Assertions.assertArrayEquals(expect, sut.createTargetArray(nums, index));
    }

    @Test
    void example2() {
        int[] nums = {1, 2, 3, 4, 0}, index = {0, 1, 2, 3, 0};
        int[] expect = {0, 1, 2, 3, 4};

        Assertions.assertArrayEquals(expect, sut.createTargetArray(nums, index));
    }

    @Test
    void example3() {
        int[] nums = {1}, index = {0};
        int[] expect = {1};

        Assertions.assertArrayEquals(expect, sut.createTargetArray(nums, index));
    }
}