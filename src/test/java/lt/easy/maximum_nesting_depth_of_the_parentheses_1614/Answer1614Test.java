package lt.easy.maximum_nesting_depth_of_the_parentheses_1614;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer1614Test {

    private final Answer1614 sut = new Answer1614();

    @Test
    void example1() {
        String s = "(1+(2*3)+((8)/4))+1";
        Assertions.assertEquals(3, sut.maxDepth(s));
    }

    @Test
    void example2() {
        String s = "(1)+((2))+(((3)))";
        Assertions.assertEquals(3, sut.maxDepth(s));
    }
}