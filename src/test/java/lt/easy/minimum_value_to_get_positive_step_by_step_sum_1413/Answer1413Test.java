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
    }

    @Test
    public void case1() {
        int[] nums = {2, 3, 5, -5, -1};
        Assertions.assertEquals(1, sut.minStartValue(nums));
    }
}