package self.pascal_row;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PascalRow {
    public static void get(int n) {
        int head = 0;
        int[] lastRow = new int[0];
        for (int i = 0; i < n; i++) {
            int[] row = new int[i + 1];

            for (int j = 0; j < row.length; j++) {
                if (j == head || j + 1 == row.length) {
                    row[j] = 1;
                } else {
                    row[j] = lastRow[j] + lastRow[j - 1];
                }
            }

            System.out.println(Arrays.stream(row).boxed().collect(Collectors.toList()));
            lastRow = row;
        }
    }

    public static void main(String[] args) {
        get(5);
    }
}
