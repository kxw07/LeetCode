package lt.easy.sign_of_the_product_of_an_array_1822;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer1822Test {


    private final Answer1822 sut = new Answer1822();

    @Test
    void example1() {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        Assertions.assertEquals(1, sut.arraySign(nums));
    }

    @Test
    void example2() {
        int[] nums = {1, 5, 0, 2, -3};
        Assertions.assertEquals(0, sut.arraySign(nums));
    }

    @Test
    void example3() {
        int[] nums = {-1, 1, -1, 1, -1};
        Assertions.assertEquals(-1, sut.arraySign(nums));
    }
}