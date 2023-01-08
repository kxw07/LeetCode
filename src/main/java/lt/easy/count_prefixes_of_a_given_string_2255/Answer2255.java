package lt.easy.count_prefixes_of_a_given_string_2255;

import java.util.Arrays;

public class Answer2255 {
    public int countPrefixes(String[] words, String s) {
        return (int)Arrays.stream(words).filter(word -> {
            return s.startsWith(word);
        }).count();
    }
}
