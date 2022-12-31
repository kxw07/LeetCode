package lt.easy.remove_digit_from_number_to_maximize_result_2259;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer2259Test {

    private final Answer2259 sut = new Answer2259();

    @Test
    void example1() {
        String number = "123";
        char digit = '3';
        Assertions.assertEquals("12", sut.removeDigit(number, digit));
    }

    @Test
    void example2() {
        String number = "1231";
        char digit = '1';
        Assertions.assertEquals("231", sut.removeDigit(number, digit));
    }

    @Test
    void example3() {
        String number = "551";
        char digit = '5';
        Assertions.assertEquals("51", sut.removeDigit(number, digit));
    }

}