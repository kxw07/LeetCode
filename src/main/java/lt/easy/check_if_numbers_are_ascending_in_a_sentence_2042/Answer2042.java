package lt.easy.check_if_numbers_are_ascending_in_a_sentence_2042;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Answer2042 {
    public boolean areNumbersAscending(String s) {
        final int[] numArray = Arrays.stream(s.split(" ")).filter(word -> {
            try {
                Integer.parseInt(word);
            } catch (NumberFormatException e) {
                return false;
            }

            return true;
        }).mapToInt(Integer::parseInt).toArray();

        for (int idx = 1; idx < numArray.length; idx++) {
            if (numArray[idx] <= numArray[idx - 1]) {
                return false;
            }
        }

        return true;
    }
}
