package lt.easy.maximum_number_of_balloons_1189;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer1189Test {

    private final Answer1189 sut = new Answer1189();

    @Test
    void example1() {
        String text = "nlaebolko";
        Assertions.assertEquals(1, sut.maxNumberOfBalloons(text));
    }

    @Test
    void example2() {
        String text = "loonbalxballpoon";
        Assertions.assertEquals(2, sut.maxNumberOfBalloons(text));
    }

    @Test
    void example3() {
        String text = "leetcode";
        Assertions.assertEquals(0, sut.maxNumberOfBalloons(text));
    }
}