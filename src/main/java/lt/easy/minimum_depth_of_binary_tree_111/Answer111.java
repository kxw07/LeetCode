package lt.easy.minimum_depth_of_binary_tree_111;

public class Answer111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth = 1;

        return find(root, depth);
    }

    private int find(TreeNode node, int depth) {
        if (noChildren(node)) {
            return depth;
        } else {
            depth++;

            return Math.min(
                    node.left == null ? Integer.MAX_VALUE : find(node.left, depth),
                    node.right == null ? Integer.MAX_VALUE : find(node.right, depth)
            );
        }
    }

    private boolean noChildren(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
