package lt.easy.maximum_nesting_depth_of_the_parentheses_1614;

public class Answer1614 {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int depth = 0;

        for (String c : s.split("")) {
            if ("(".equals(c)) {
                depth++;
            }

            if (")".equals(c)) {
                depth--;
            }
            maxDepth = Math.max(maxDepth, depth);
        }

        return maxDepth;
    }
}
