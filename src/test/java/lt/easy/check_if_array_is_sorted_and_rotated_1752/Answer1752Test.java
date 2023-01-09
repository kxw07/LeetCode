package lt.easy.check_if_array_is_sorted_and_rotated_1752;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer1752Test {

    private final Answer1752 sut = new Answer1752();

    @Test
    void example1() {
        int[] nums = {3, 4, 5, 1, 2};
        Assertions.assertTrue(sut.check(nums));
    }

    @Test
    void example2() {
        int[] nums = {2, 1, 3, 4};
        Assertions.assertFalse(sut.check(nums));
    }

    @Test
    void example3() {
        int[] nums = {1, 2, 3};
        Assertions.assertTrue(sut.check(nums));
    }

}