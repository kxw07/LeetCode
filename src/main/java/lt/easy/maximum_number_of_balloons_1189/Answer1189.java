package lt.easy.maximum_number_of_balloons_1189;

import java.util.Arrays;
import java.util.Collections;

public class Answer1189 {
    public int maxNumberOfBalloons(String text) {
        text =addPrefixAndSuffix(text);
        final int b = text.split("b").length - 1;
        final int a = text.split("a").length - 1;
        final int l = (text.split("l").length - 1)/2;
        final int o = (text.split("o").length - 1)/2;
        final int n = text.split("n").length - 1;

        return Collections.min(Arrays.asList(b, a, l, o, n));
    }

    public String addPrefixAndSuffix(String text) {
        return "z" + text + "z";
    }
}
