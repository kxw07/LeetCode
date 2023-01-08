package lt.easy.shift_2D_grid_1260;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Answer1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> concat = new ArrayList<>();
        for (int[] ints : grid) {
            concat.addAll(Arrays.stream(ints).boxed().collect(Collectors.toList()));
        }

        if (k > concat.size()) {
            k = k % concat.size();
        }

        List<Integer> moved = new ArrayList<>();
        moved.addAll(concat.subList(concat.size() - k, concat.size()));
        moved.addAll(concat.subList(0, concat.size() - k));


        int columnLength = grid[0].length;
        int rowLength = grid.length;
        return IntStream.range(0, rowLength).mapToObj(idx -> {
            return moved.subList(idx * columnLength, (idx + 1) * columnLength);
        }).collect(Collectors.toList());
    }
}
