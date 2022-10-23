package lt.easy.check_if_numbers_are_ascending_in_a_sentence_2042;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Answer2042Test {

    private final Answer2042 sut = new Answer2042();

    @Test
    public void example1() {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        Assertions.assertEquals(true, sut.areNumbersAscending(s));
    }

    @Test
    public void example2() {
        String s = "hello world 5 x 5";
        Assertions.assertEquals(false, sut.areNumbersAscending(s));
    }

    @Test
    public void example3() {
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        Assertions.assertEquals(false, sut.areNumbersAscending(s));
    }

}