package lt.easy.rotate_string_796;

public class Answer796 {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && s.concat(s).contains(goal);
    }
}
