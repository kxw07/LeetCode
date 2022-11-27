package lt.easy.calculate_digit_sum_of_a_string_2243;

import java.util.Arrays;

public class Answer2243 {
    public String digitSum(String s, int k) {
        return cutAndSum(s, k);
    }

    public String cutAndSum(String s, int k) {
        if (s.length() <= k) return s;

        StringBuilder result = new StringBuilder();

        for (int idx = 0; idx < s.length(); idx += k) {
            if (idx + k > s.length()) {
                result.append(sumInt(s.substring(idx, s.length())));
            } else {
                result.append(sumInt(s.substring(idx, idx + k)));
            }
        }

        return cutAndSum(result.toString(), k);
    }

    public int sumInt(String s) {
        return Arrays.stream(s.split("")).mapToInt(Integer::parseInt).sum();
    }

}
