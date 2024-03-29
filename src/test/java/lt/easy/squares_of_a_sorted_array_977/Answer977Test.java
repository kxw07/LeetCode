package lt.easy.squares_of_a_sorted_array_977;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Answer977Test {
    @Test
    public void example1() {
        int[] given = {-4, -1, 0, 3, 10};
        int[] expect = {0, 1, 9, 16, 100};
        Answer977 solution = new Answer977();

        assertArrayEquals(expect, solution.sortedSquares(given));
    }

    @Test
    public void example2() {
        int[] given = {-7, -3, 2, 3, 11};
        int[] expect = {4, 9, 9, 49, 121};
        Answer977 solution = new Answer977();

        assertArrayEquals(expect, solution.sortedSquares(given));
    }
}