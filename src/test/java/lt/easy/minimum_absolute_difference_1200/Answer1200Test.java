package lt.easy.minimum_absolute_difference_1200;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Answer1200Test {

    private final Answer1200 sut = new Answer1200();

    @Test
    void example1() {
        int[] arr = new int[]{4, 2, 1, 3};
        List<List<Integer>> expect = List.of(List.of(1, 2), List.of(2, 3), List.of(3, 4));
        List<List<Integer>> actual = sut.minimumAbsDifference(arr);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void example2() {
        int[] arr = new int[]{1, 3, 6, 10, 15};
        List<List<Integer>> expect = List.of(List.of(1, 3));
        List<List<Integer>> actual = sut.minimumAbsDifference(arr);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void example3() {
        int[] arr = new int[]{3, 8, -10, 23, 19, -4, -14, 27};
        List<List<Integer>> expect = List.of(List.of(-14, -10), List.of(19, 23), List.of(23, 27));
        List<List<Integer>> actual = sut.minimumAbsDifference(arr);

        Assertions.assertEquals(expect, actual);
    }
}