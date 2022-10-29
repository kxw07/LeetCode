package lt.easy.rank_transform_of_an_array_1331;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Answer1331 {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArray = Arrays.stream(arr).distinct().sorted().toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (int idx = 0; idx < sortedArray.length; idx++) {
            map.putIfAbsent(sortedArray[idx], idx + 1);
        }

        return Arrays.stream(arr).map(i -> map.get(i)).toArray();
    }
}
