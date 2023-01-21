package lt.easy.remove_duplicates_from_sorted_array_26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer26Test {

    private final Answer26 sut = new Answer26();

    @Test
    void example1() {
        int[] nums = {1, 1, 2};
        Assertions.assertEquals(2, sut.removeDuplicates(nums));
    }

    @Test
    void example2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Assertions.assertEquals(5, sut.removeDuplicates(nums));
    }
}