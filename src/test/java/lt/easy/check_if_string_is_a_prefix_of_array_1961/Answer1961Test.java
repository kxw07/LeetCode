package lt.easy.check_if_string_is_a_prefix_of_array_1961;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer1961Test {
    private final Answer1961 sut = new Answer1961();

    @Test
    void example1() {
        String s = "iloveleetcode";
        String[] words = {"i", "love", "leetcode", "apples"};

        Assertions.assertTrue(sut.isPrefixString(s, words));
    }

    @Test
    void example2() {
        String s = "iloveleetcode";
        String[] words = {"apples", "i", "love", "leetcode"};

        Assertions.assertFalse(sut.isPrefixString(s, words));
    }

    @Test
    void case1() {
        String s = "a";
        String[] words = {"aa", "aaaa", "banana"};

        Assertions.assertFalse(sut.isPrefixString(s, words));
    }

    @Test
    void case2() {
        String s = "aaa";
        String[] words = {"aa","aaa","fjaklfj"};

        Assertions.assertFalse(sut.isPrefixString(s, words));
    }

    @Test
    void case3() {
        String s = "ccccccccc";
        String[] words = {"c","cc"};

        Assertions.assertFalse(sut.isPrefixString(s, words));
    }

    @Test
    void case4() {
        String s = "z";
        String[] words = {"z"};

        Assertions.assertTrue(sut.isPrefixString(s, words));
    }
}