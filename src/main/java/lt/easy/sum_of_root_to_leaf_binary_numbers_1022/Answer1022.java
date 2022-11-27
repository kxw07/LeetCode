package lt.easy.sum_of_root_to_leaf_binary_numbers_1022;

import java.util.ArrayList;
import java.util.List;

public class Answer1022 {
    public int sumRootToLeaf(TreeNode root) {
        List<Integer> nodeResult = new ArrayList<>();
        preorder(root, 0, nodeResult);

        return nodeResult.stream().mapToInt(Integer::intValue).sum();
    }

    public void preorder(TreeNode root, int sum, List<Integer> nodeResult) {
        if (root == null) return;

        sum = (sum << 1) + root.val;
        if (root.left == null && root.right == null) {
            nodeResult.add(sum);
            return;
        }

        preorder(root.left, sum, nodeResult);
        preorder(root.right, sum, nodeResult);
    }

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


