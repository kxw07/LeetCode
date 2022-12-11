package lt.easy.subtract_the_product_and_sum_of_digits_of_an_Integer_1281;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer1281Test {

    private final Answer1281 sut = new Answer1281();

    @Test
    void example1(){
        int n = 234;
        Assertions.assertEquals(15, sut.subtractProductAndSum(n));
    }

    @Test
    void example2(){
        int n = 4421;
        Assertions.assertEquals(21, sut.subtractProductAndSum(n));
    }

    @Test
    void example3(){
        int n = 114;
        Assertions.assertEquals(-2, sut.subtractProductAndSum(n));
    }
}