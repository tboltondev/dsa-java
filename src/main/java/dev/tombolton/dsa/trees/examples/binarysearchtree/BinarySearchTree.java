package dev.tombolton.dsa.trees.examples.binarysearchtree;

public class BinarySearchTree {
    public static <T> TreeNode<T> search(T searchValue, TreeNode<T> node) {
        if (searchValue == node.getValue()) {
            return node;
        }

        if ((Integer) searchValue < (Integer) node.getValue()) { // should implement comparison based on type
            return search(searchValue, node.getLeftChild());
        } else {
            return search(searchValue, node.getRightChild());
        }
    }

    public static <T> void insert(T value, TreeNode<T> node) {
        if ((Integer) value > (Integer) node.getValue()) {
            if (node.getRightChild() != null) {
                insert(value, node.getRightChild());
            } else {
                node.setRightChild(new TreeNode<>(value));
            }
        } else if ((Integer) value < (Integer) node.getValue()) { // should implement comparison based on type
            if (node.getLeftChild() != null) {
                insert(value, node.getLeftChild());
            } else {
                node.setLeftChild(new TreeNode<>(value));
            }
        }
    }
}
