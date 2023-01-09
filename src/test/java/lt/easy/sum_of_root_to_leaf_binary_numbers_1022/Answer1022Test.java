package lt.easy.sum_of_root_to_leaf_binary_numbers_1022;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Answer1022Test {

    private final Answer1022 sut = new Answer1022();

    @Test
    public void example1() {
//        int[] root = {1, 0, 1, 0, 1, 0, 1};
        final Answer1022.TreeNode treeNode = new Answer1022.TreeNode(1,
                new Answer1022.TreeNode(0,
                        new Answer1022.TreeNode(0, null, null), new Answer1022.TreeNode(1, null, null)),
                new Answer1022.TreeNode(1,
                        new Answer1022.TreeNode(0, null, null), new Answer1022.TreeNode(1, null, null)));

        Assertions.assertEquals(22, sut.sumRootToLeaf(treeNode));
    }

    @Test
    public void example2() {
//        int[] root = {0};
        final Answer1022.TreeNode treeNode = new Answer1022.TreeNode(0, null, null);
        Assertions.assertEquals(0, sut.sumRootToLeaf(treeNode));
    }

}