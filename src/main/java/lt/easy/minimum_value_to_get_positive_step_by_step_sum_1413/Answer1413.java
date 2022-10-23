package lt.easy.minimum_value_to_get_positive_step_by_step_sum_1413;


public class Answer1413 {

    public int minStartValue(int[] nums) {
        int minValue = 0;
        int previousSum = 0;

        for (int num : nums) {
            previousSum = previousSum + num;
            if (previousSum < minValue) minValue = previousSum;
        }

        return 1 - minValue;
    }
}
