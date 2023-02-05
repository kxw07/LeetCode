package lt.easy.minimum_depth_of_binary_tree_111;

public class Answer111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (leftDepth == 0 || rightDepth == 0) {
            return 1 + Math.max(leftDepth, rightDepth);
        } else {
            return 1 + Math.min(leftDepth, rightDepth);
        }
    }
}
