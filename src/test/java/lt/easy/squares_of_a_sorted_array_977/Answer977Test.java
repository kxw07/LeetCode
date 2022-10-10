package lt.easy.squares_of_a_sorted_array_977;

import org.junit.Assert;
import org.junit.Test;

public class Answer977Test {
    @Test
    public void example1() {
        int[] given = new int[]{-4, -1, 0, 3, 10};
        int[] expect = new int[]{0, 1, 9, 16, 100};
        Answer977 solution = new Answer977();

        Assert.assertArrayEquals(expect, solution.sortedSquares(given));
    }

    @Test
    public void example2() {
        int[] given = new int[]{-7, -3, 2, 3, 11};
        int[] expect = new int[]{4, 9, 9, 49, 121};
        Answer977 solution = new Answer977();

        Assert.assertArrayEquals(expect, solution.sortedSquares(given));
    }
}