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

    public static <T> TreeNode<T> delete(T value, TreeNode<T> node) {
        if (node == null) {
            return null;
        } else if ((Integer) value < (Integer) node.getValue()) {
            node.setLeftChild(delete(value, node.getLeftChild()));
            return node;
        } else if ((Integer) value > (Integer) node.getValue()) {
            node.setRightChild(delete(value, node.getRightChild()));
            return node;
        } else if (value == node.getValue()) {
            if (node.getLeftChild() == null) {
                return node.getRightChild();
            } else if (node.getRightChild() == null) {
                return node.getLeftChild();
            } else {
                node.setRightChild(lift(node.getRightChild(), node));
                return node;
            }
        }
        return null;
    }

    private static <T> TreeNode<T> lift(TreeNode<T> node, TreeNode<T> nodeToDelete) {
        if (node.getLeftChild() != null) {
            node.setLeftChild(lift(node.getLeftChild(), nodeToDelete));
            return node;
        } else {
            nodeToDelete.setValue(node.getValue());
            return node.getRightChild();
        }
    }

    public static <T> String toString(TreeNode<T> root) {
        if (root == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(root.getValue());

        String pointerRight = "└──";
        String pointerLeft = (root.getRightChild() != null) ? "├──" : "└──";

        childNodeToString(root.getLeftChild(), stringBuilder, "", pointerLeft, root.getRightChild() != null);
        childNodeToString(root.getRightChild(), stringBuilder, "", pointerRight, false);

        return stringBuilder.toString();
    }

    private static <T> void childNodeToString(TreeNode<T> node,
                                              StringBuilder stringBuilder,
                                              String padding,
                                              String pointer,
                                              boolean hasRightSibling) {
        if (node != null) {
            stringBuilder.append("\n");
            stringBuilder.append(padding);
            stringBuilder.append(pointer);
            stringBuilder.append(node.getValue());

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("  ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerForRight = "└──";
            String pointerForLeft = (node.getRightChild() != null) ? "├──" : "└──";

            childNodeToString(node.getLeftChild(), stringBuilder, paddingForBoth, pointerForLeft, node.getRightChild() != null);
            childNodeToString(node.getRightChild(), stringBuilder, paddingForBoth, pointerForRight, false);
        }
    }
}
