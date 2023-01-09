package lt.easy.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AnswerFizzBuzzTest {
    private final AnswerFizzBuzz sut = new AnswerFizzBuzz();

    @Test
    void example1() {
        int n = 15;
        List<String> expect = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

        Assertions.assertEquals(expect, sut.fizzBuzz(n));
    }
}