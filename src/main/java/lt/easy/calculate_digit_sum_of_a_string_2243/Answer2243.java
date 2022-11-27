package lt.easy.calculate_digit_sum_of_a_string_2243;

import java.util.Arrays;

public class Answer2243 {
    public String digitSum(String s, int k) {
        String result = s;

        while (result.length() > k) {
            result = cutAndSum(result, k);
        }

        return result;
    }

    public String cutAndSum(String s, int k) {
        String result = "";

        for (int idx = 0; idx < s.length(); idx += k) {
            if (idx + k > s.length()) {
                result += sumInt(s.substring(idx, s.length()));
            } else {
                result += sumInt(s.substring(idx, idx + k));
            }
        }

        return result;
    }

    public int sumInt(String s) {
        return Arrays.stream(s.split("")).mapToInt(Integer::parseInt).sum();
    }

}
