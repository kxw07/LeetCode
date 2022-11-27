package lt.easy.sum_of_root_to_leaf_binary_numbers_1022;

import java.util.List;

public class Answer1022 {

    private int result = 0;

    public int sumRootToLeaf(TreeNode root) {
        preorder(root, 0);

        return result;
    }

    public void preorder(TreeNode root, int sum) {
        if (root == null) return;

        sum = (sum << 1) + root.val;
        if (root.left == null && root.right == null) {
            result += sum;
            return;
        }

        preorder(root.left, sum);
        preorder(root.right, sum);
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


