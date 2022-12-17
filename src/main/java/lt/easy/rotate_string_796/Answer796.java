package lt.easy.rotate_string_796;

public class Answer796 {
    public boolean rotateString(String s, String goal) {
        for (int idx = 0; idx < s.length(); idx++) {
            if (s.substring(idx, idx + 1).equals(goal.substring(0, 1))) {
                if (s.substring(idx).concat(s.substring(0, idx)).equals(goal)) {
                    return true;
                }
            }
        }

        return false;
    }
}
