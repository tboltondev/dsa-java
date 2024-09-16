package dev.tombolton.dsa.trees.examples.binarysearchtree;

public class BinarySearchTree {
    public static <T> TreeNode<T> search(T searchValue, TreeNode<T> root) {
        if (searchValue == root.value) {
            return root;
        }

        if ((Integer) searchValue < (Integer) root.value) { // should implement comparison based on type
            return search(searchValue, root.leftChild);
        } else {
            return search(searchValue, root.rightChild);
        }
    }

    public static <T> void insert(T value, TreeNode<T> node) {
        if ((Integer) value > (Integer) node.value) {
            if (node.rightChild != null) {
                insert(value, node.rightChild);
            } else {
                node.rightChild = new TreeNode<>(value);
            }
        } else if ((Integer) value < (Integer) node.value) { // should implement comparison based on type
            if (node.leftChild != null) {
                insert(value, node.leftChild);
            } else {
                node.leftChild = new TreeNode<>(value);
            }
        }
    }
}
