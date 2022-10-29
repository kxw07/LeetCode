package lt.easy.number_of_valid_words_in_a_sentence_2047;

import java.util.Arrays;

public class Answer2047 {
    public int countValidWords(String sentence) {
        return (int) Arrays.stream(sentence.split(" ")).filter(this::checkValid).count();
    }

    private boolean checkValid(String s) {
        String charPattern = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        String digitPattern = "(.)*(\\d)(.)*";

        if (s.matches(charPattern) && !s.matches(digitPattern) && !s.isEmpty()) {
            return true;
        }

        return false;
    }
}
