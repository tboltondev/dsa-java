package dev.tombolton.dsa.trees.examples.binarysearchtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTest {
    @Test
    public void searchShouldReturnCorrectNode() {
        // Arrange
        TreeNode<Integer> node72 = new TreeNode<>(72);
        TreeNode<Integer> node48 = new TreeNode<>(48);
        TreeNode<Integer> node84 = new TreeNode<>(84);
        TreeNode<Integer> node53 = new TreeNode<>(53);
        TreeNode<Integer> node27 = new TreeNode<>(27);
        TreeNode<Integer> node6 = new TreeNode<>(6);

        node72.rightChild = node84;
        node72.leftChild = node53;

        node27.rightChild = node48;
        node27.leftChild = node6;

        TreeNode<Integer> root = new TreeNode<>(50, node27, node72);

        // Act
        TreeNode<Integer> result = BinarySearchTree.search(48, root);

        // Assert
        assertEquals(node48, result);
    }
}
