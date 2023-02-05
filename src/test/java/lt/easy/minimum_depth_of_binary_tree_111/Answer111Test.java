package lt.easy.minimum_depth_of_binary_tree_111;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer111Test {
    private final Answer111 sut = new Answer111();

    @Test
    void example1() {

        TreeNode root = new TreeNode(3,
                new TreeNode(9, null, null),
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(7, null, null)));

        Assertions.assertEquals(2, sut.minDepth(root));
    }

    @Test
    void example2() {

        TreeNode root = new TreeNode(2,
                null,
                new TreeNode(3,
                        null,
                        new TreeNode(4,
                                null,
                                new TreeNode(5,
                                        null,
                                        new TreeNode(6, null, null)))));

        Assertions.assertEquals(5, sut.minDepth(root));
    }

}