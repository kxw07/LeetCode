package lt.easy.divide_a_string_into_groups_of_size_k_2138;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Answer2138Test {
    @Test
    public void example1() {
        Answer2138 sut = new Answer2138();
        String[] expect = new String[]{"abc", "def", "ghi"};

        assertArrayEquals(expect, sut.divideString("abcdefghi", 3, 'x'));
    }

    @Test
    public void example2() {
        Answer2138 sut = new Answer2138();
        String[] expect = new String[]{"abc","def","ghi","jxx"};

        assertArrayEquals(expect, sut.divideString("abcdefghij", 3, 'x'));
    }

}