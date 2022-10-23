package lt.easy.minimum_value_to_get_positive_step_by_step_sum_1413;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer1413 {

    public int minStartValue(int[] nums) {
        List<Integer> sumArray = new ArrayList<>();

        Arrays.stream(nums).reduce(0, (sum, num) -> {
            int newSum = sum + num;
            sumArray.add(newSum);

            return newSum;
        });

        int minValue = sumArray.stream().mapToInt(num -> num).min().orElseThrow();

        if (minValue >= 1) {
            return 1;
        } else {
            return 1 - minValue;
        }
    }
}
