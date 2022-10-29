package lt.easy.rank_transform_of_an_array_1331;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Answer1331Test {

    private final Answer1331 sut = new Answer1331();

    @Test
    public void example1() {
        int[] arr = new int[]{40, 10, 20, 30};
        Assertions.assertArrayEquals(new int[]{4, 1, 2, 3}, sut.arrayRankTransform(arr));
    }

    @Test
    public void example2() {
        int[] arr = new int[]{100, 100, 100};
        Assertions.assertArrayEquals(new int[]{1, 1, 1}, sut.arrayRankTransform(arr));
    }

    @Test
    public void example3() {
        int[] arr = new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12};
        Assertions.assertArrayEquals(new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3}, sut.arrayRankTransform(arr));
    }
}