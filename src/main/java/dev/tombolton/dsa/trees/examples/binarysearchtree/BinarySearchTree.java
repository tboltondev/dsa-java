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
}
