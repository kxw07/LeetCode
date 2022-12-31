package lt.easy.remove_digit_from_number_to_maximize_result_2259;

public class Answer2259 {
    public String removeDigit(String number, char digit) {
        String[] splitNumber = number.split("");
        String max = "";

        for (int idx = 0; idx < splitNumber.length; idx++) {
            if (splitNumber[idx].equals(String.valueOf(digit))) {
                String removedDigit = number.substring(0, idx) + number.substring(idx + 1);
                if (removedDigit.compareTo(max) > 0) max = removedDigit;
            }
        }

        return max;
    }
}
