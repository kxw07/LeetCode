package lt.easy.sort_even_and_odd_indices_independently_2164;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer2164Test {
    private final Answer2164 sut = new Answer2164();

    @Test
    void example1() {
        int[] nums = {4, 1, 2, 3};
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 1}, sut.sortEvenOdd(nums));
    }

    @Test
    void example2() {
        int[] nums = {2, 1};
        Assertions.assertArrayEquals(new int[]{2, 1}, sut.sortEvenOdd(nums));
    }

    @Test
    void case1() {
        int[] nums = {5, 39, 33, 5, 12, 27, 20, 45, 14, 25, 32, 33, 30, 30, 9, 14, 44, 15, 21};
        Assertions.assertArrayEquals(new int[]{5, 45, 9, 39, 12, 33, 14, 30, 20, 27, 21, 25, 30, 15, 32, 14, 33, 5, 44}, sut.sortEvenOdd(nums));
    }
}