package lt.easy.number_of_valid_words_in_a_sentence_2047;

import java.util.Arrays;

public class Answer2047 {
    public int countValidWords(String sentence) {
        return (int) Arrays.stream(sentence.split(" ")).filter(s -> {
            if (s.trim().isEmpty()) {
                return false;
            }

            return checkValid(s);
        }).count();
    }

    private boolean checkValid(String s) {
        String digitPattern = "(.)*(\\d)(.)*";
        String punctuationPattern = "(.)*([!,.])(.)*";

        if (s.matches(digitPattern)) {
            return false;
        }

        if (s.contains("-")) {
            if (s.split("-").length > 2) {
                return false;
            } else if (s.startsWith("-") || s.endsWith("-")) {
                return false;
            } else if (String.valueOf(s.charAt(s.lastIndexOf("-") - 1)).matches(punctuationPattern)
                    || String.valueOf(s.charAt(s.lastIndexOf("-") + 1)).matches(punctuationPattern)) {
                return false;
            }
        }

        if (s.matches(punctuationPattern)) {
            if (s.split(punctuationPattern).length > 1) {
                return false;
            } else if (s.substring(0, s.length() - 1).matches(punctuationPattern)) {
                return false;
            }
        }

        System.out.println(s);
        return true;
    }
}
