package dev.tombolton.dsa.trees.examples.binarysearchtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

        node72.setRightChild(node84);
        node72.setLeftChild(node53);

        node27.setRightChild(node48);
        node27.setLeftChild(node6);

        TreeNode<Integer> root = new TreeNode<>(50, node27, node72);

        // Act
        TreeNode<Integer> result = BinarySearchTree.search(48, root);

        // Assert
        assertEquals(node48, result);
    }

    @Test
    public void insertShouldInsertNodeCorrectlyInTree() {
        // Arrange
        TreeNode<Integer> node72 = new TreeNode<>(72);
        TreeNode<Integer> node48 = new TreeNode<>(48);
        TreeNode<Integer> node84 = new TreeNode<>(84);
        TreeNode<Integer> node53 = new TreeNode<>(53);
        TreeNode<Integer> node27 = new TreeNode<>(27);
        TreeNode<Integer> node6 = new TreeNode<>(6);

        node72.setRightChild(node84);
        node72.setLeftChild(node53);

        node27.setRightChild(node48);
        node27.setLeftChild(node6);

        TreeNode<Integer> root = new TreeNode<>(50, node27, node72);

        // Act
        BinarySearchTree.insert(60, root);

        // Assert
        assertEquals(60, node53.getRightChild().getValue());
    }

    @Test
    public void insertShouldDoNothingIfElementExistsInTree() {
        // Arrange
        TreeNode<Integer> node72 = new TreeNode<>(72);
        TreeNode<Integer> node48 = new TreeNode<>(48);
        TreeNode<Integer> node84 = new TreeNode<>(84);
        TreeNode<Integer> node53 = new TreeNode<>(53);
        TreeNode<Integer> node27 = new TreeNode<>(27);
        TreeNode<Integer> node6 = new TreeNode<>(6);

        node72.setRightChild(node84);
        node72.setLeftChild(node53);

        node27.setRightChild(node48);
        node27.setLeftChild(node6);

        TreeNode<Integer> root = new TreeNode<>(50, node27, node72);

        // Act
        BinarySearchTree.insert(84, root);

        // Assert
        assertNull(node6.getLeftChild());
        assertNull(node6.getRightChild());
        assertNull(node48.getLeftChild());
        assertNull(node48.getRightChild());
        assertNull(node53.getLeftChild());
        assertNull(node53.getRightChild());
        assertNull(node84.getLeftChild());
        assertNull(node84.getRightChild());
    }
}
