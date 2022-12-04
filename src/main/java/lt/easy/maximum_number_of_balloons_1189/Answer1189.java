package lt.easy.maximum_number_of_balloons_1189;

import java.util.Arrays;
import java.util.Collections;

public class Answer1189 {
    public int maxNumberOfBalloons(String text) {
        int[] charCount = new int[5];

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b':
                    charCount[0]++;
                    break;
                case 'a':
                    charCount[1]++;
                    break;
                case 'l':
                    charCount[2]++;
                    break;
                case 'o':
                    charCount[3]++;
                    break;
                case 'n':
                    charCount[4]++;
                    break;
            }
        }

        return Collections.min(Arrays.asList(charCount[0], charCount[1], charCount[2] / 2, charCount[3] / 2, charCount[4]));
    }
}
