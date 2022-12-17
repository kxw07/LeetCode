package lt.easy.range_sum_of_BST_933;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer933Test {

    private final Answer933 sut = new Answer933();

    @Test
    void example1() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3, null, null), new TreeNode(7, null, null)),
                new TreeNode(15, null, new TreeNode(18, null, null)));

        Assertions.assertEquals(32, sut.rangeSumBST(root, 7, 15));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3, new TreeNode(1, null, null), null),
                        new TreeNode(7, new TreeNode(6, null, null), null)),
                new TreeNode(15,
                        new TreeNode(13, null, null),
                        new TreeNode(18, null, null)));

        Assertions.assertEquals(23, sut.rangeSumBST(root, 6, 10));
    }

}