package lt.easy.divide_a_string_into_groups_of_size_k_2138;


import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Answer2138 {
    public String[] divideString(String s, int k, char fill) {
        char[] input = s.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        StringBuilder tmp = new StringBuilder();

        for (int idx = 0; idx < s.length(); idx++) {
            if (k == tmp.length()) {
                result.add(tmp.toString());
                tmp = new StringBuilder();
            }

            tmp.append(input[idx]);

            if (idx == s.length() - 1 && tmp.length() > 0) {
                tmp.append(getFillChars(tmp.length(), k, fill));
                result.add(tmp.toString());
            }
        }

        return result.toArray(new String[result.size()]);
    }

    private String getFillChars(int left, int size, char fill) {
        return IntStream.range(left, size).mapToObj(i -> Character.toString(fill)).collect(Collectors.joining());
    }
}