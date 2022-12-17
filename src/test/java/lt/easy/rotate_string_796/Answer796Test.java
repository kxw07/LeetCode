package lt.easy.rotate_string_796;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer796Test {
    private final Answer796 sut = new Answer796();

    @Test
    void example1() {
        String s = "abcde", goal = "cdeab";
        Assertions.assertTrue(sut.rotateString(s, goal));
    }

    @Test
    void example2() {
        String s = "abcde", goal = "abced";
        Assertions.assertFalse(sut.rotateString(s, goal));
    }

}