package lt.easy.check_if_numbers_are_ascending_in_a_sentence_2042;


public class Answer2042 {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int lastNum = 0;

        for (String word : words) {
            try {
                int num = Integer.parseInt(word);
                if (num <= lastNum) {
                    return false;
                }

                lastNum = num;
            } catch (NumberFormatException e) {
                doNothing();
            }

        }

        return true;
    }

    private void doNothing() {

    }
}
