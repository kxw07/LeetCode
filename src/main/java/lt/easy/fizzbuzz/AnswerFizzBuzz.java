package lt.easy.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class AnswerFizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int idx = 1; idx <= n; idx++) {
            if (idx % 3 == 0 && idx % 5 == 0) {
                result.add("FizzBuzz");
            } else if (idx % 3 == 0) {
                result.add("Fizz");
            } else if (idx % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(idx));
            }
        }

        return result;
    }
}
