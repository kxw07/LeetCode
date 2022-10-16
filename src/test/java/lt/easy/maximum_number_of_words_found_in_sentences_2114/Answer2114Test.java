package lt.easy.maximum_number_of_words_found_in_sentences_2114;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Answer2114Test {

    private Answer2114 sut;

    @BeforeEach
    public void setup() {
        sut = new Answer2114();
    }

    @Test
    public void example1() {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        Assertions.assertEquals(6, sut.mostWordsFound(sentences));
    }

    @Test
    public void example2() {
        String[] sentences = new String[]{"please wait", "continue to fight", "continue to win"};
        Assertions.assertEquals(3, sut.mostWordsFound(sentences));
    }
}