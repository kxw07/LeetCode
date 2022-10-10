package lt.easy.divide_a_string_into_groups_of_size_k_2138;


public class Answer2138 {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() % k != 0) {
            sb.append(fill);
        }

        String[] result = new String[sb.length() / k];

        for (int idx = 0; idx < sb.length() / k; idx++) {
            result[idx] = sb.substring(idx * k, (idx + 1) * k);
        }

        return result;
    }
}