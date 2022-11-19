package lt.easy.minimum_absolute_difference_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDistance = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();

        for (int idx = 0; idx < arr.length; idx++) {
            int nextIdx = idx + 1;
            if (nextIdx == arr.length) break;

            int distance = arr[nextIdx] - arr[idx];
            if (distance < minDistance) {
                minDistance = distance;
                result.clear();
                result.add(List.of(arr[idx], arr[nextIdx]));
            } else if (distance == minDistance) {
                result.add(List.of(arr[idx], arr[nextIdx]));
            }
        }

        return result;
    }
}
