package lt.easy.count_prefixes_of_a_given_string_2255;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer2255Test {

    private final Answer2255 sut = new Answer2255();

    @Test
    public void example1() {
        String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        String s = "abc";

        Assertions.assertEquals(3, sut.countPrefixes(words, s));
    }

    @Test
    public void example2() {
        String[] words = {"a", "a"};
        String s = "aa";

        Assertions.assertEquals(2, sut.countPrefixes(words, s));
    }

}