package lt.easy.range_sum_of_BST_933;

import java.util.ArrayList;
import java.util.List;

public class Answer933 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> values = new ArrayList<>();
        getValue(root, values);
        System.out.println(values);

        return values.stream().filter(s -> low <= s && s <= high).mapToInt(Integer::intValue).sum();
    }

    private void getValue(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }

        values.add(node.val);

        getValue(node.left, values);
        getValue(node.right, values);
    }
}
