package lt.easy.check_if_string_is_a_prefix_of_array_1961;


public class Answer1961 {
    public boolean isPrefixString(String s, String[] words) {
        if (s.length() > String.join("", words).length()) return false;

        for (String word : words) {
            if (s.length() == 0) {
                return true;
            }

            if (s.startsWith(word)) {
                s = s.substring(word.length());
            } else {
                return false;
            }
        }

        return true;
    }
}
