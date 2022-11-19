package lt.easy.minimum_absolute_difference_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDistance = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();

        final int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        for (int idx = 0; idx < sortedArr.length; idx++) {
            int nextIdx = idx + 1;
            if (nextIdx == sortedArr.length) break;

            int distance = sortedArr[nextIdx] - sortedArr[idx];
            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        for (int idx = 0; idx < sortedArr.length; idx++) {
            int nextIdx = idx + 1;
            if (nextIdx == sortedArr.length) break;

            if ((sortedArr[nextIdx] - sortedArr[idx]) == minDistance) {
                result.add(List.of(sortedArr[idx], sortedArr[nextIdx]));
            }
        }

        return result;
    }
}
