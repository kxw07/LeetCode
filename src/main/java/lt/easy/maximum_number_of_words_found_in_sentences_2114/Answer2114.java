package lt.easy.maximum_number_of_words_found_in_sentences_2114;

import java.util.Arrays;

public class Answer2114 {
    public int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences).mapToInt(s -> s.split(" ").length).max().orElse(0);
    }
}
