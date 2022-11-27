package lt.easy.calculate_digit_sum_of_a_string_2243;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer2243Test {

    private final Answer2243 sut = new Answer2243();

    @Test
    public void example1() {
        String s = "11111222223";
        int k = 3;

        Assertions.assertEquals("135", sut.digitSum(s, k));
    }

    @Test
    public void example2() {
        String s = "00000000";
        int k = 3;

        Assertions.assertEquals("000", sut.digitSum(s, k));
    }
}