package lt.easy.check_if_string_is_a_prefix_of_array_1961;


public class Answer1961 {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder concat = new StringBuilder();
        for (String word : words) {
            concat.append(word);
            if (s.equals(concat.toString())) return true;
            if (!s.startsWith(concat.toString())) return false;
        }

        return false;
    }
}
