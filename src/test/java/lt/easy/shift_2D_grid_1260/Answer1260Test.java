package lt.easy.shift_2D_grid_1260;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Answer1260Test {
    private final Answer1260 sut = new Answer1260();

    @Test
    public void example1() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;

//        int[][] expect = {{9, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        List<List<Integer>> expect = List.of(List.of(9, 1, 2), List.of(3, 4, 5), List.of(6, 7, 8));
        Assertions.assertEquals(expect, sut.shiftGrid(grid, k));
    }

    @Test
    public void example2() {
        int[][] grid = {{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}};
        int k = 4;

        //int[][] expect = {{12, 0, 21, 13}, {3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}};
        List<List<Integer>> expect = List.of(List.of(12, 0, 21, 13), List.of(3, 8, 1, 9), List.of(19, 7, 2, 5), List.of(4, 6, 11, 10));
        Assertions.assertEquals(expect, sut.shiftGrid(grid, k));
    }

    @Test
    public void example3() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 9;

        List<List<Integer>> expect = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        Assertions.assertEquals(expect, sut.shiftGrid(grid, k));
    }

    @Test
    public void example4() {
        int[][] grid = {{1}, {2}, {3}, {4}, {7}, {6}, {5}};
        int k = 23;

        List<List<Integer>> expect = List.of(List.of(6), List.of(5), List.of(1), List.of(2), List.of(3), List.of(4), List.of(7));
        Assertions.assertEquals(expect, sut.shiftGrid(grid, k));
    }

}