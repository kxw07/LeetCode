package lt.easy.most_frequent_number_following_key_in_an_array_2190;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer2190Test {
    private final Answer2190 sut = new Answer2190();

    @Test
    void example1() {
        int[] nums = {1, 100, 200, 1, 100};
        int key = 1;

        Assertions.assertEquals(100, sut.mostFrequent(nums, key));
    }

    @Test
    void example2() {
        int[] nums = {2, 2, 2, 2, 3};
        int key = 2;

        Assertions.assertEquals(2, sut.mostFrequent(nums, key));
    }
}