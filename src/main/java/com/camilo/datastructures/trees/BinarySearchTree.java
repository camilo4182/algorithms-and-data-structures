package com.camilo.datastructures.trees;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Data
public class BinarySearchTree <T extends Comparable<T>> {

    private BinarySearchTreeNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(BinarySearchTreeNode<T> root, T value) {
        BinarySearchTreeNode<T> newNode = new BinarySearchTreeNode<>(value);
        if (root == null)
            root = newNode;
        if (value.compareTo((T) root.getValue()) < 0) {
            if (root.getLeft() == null)
                root.setLeft(newNode);
            else
                insert(root.getLeft(), value);
        }
        else {
            if (root.getRight() == null)
                root.setRight(newNode);
            else
                insert(root.getRight(), value);
        }
    }

    public void insert(T value) {
        if (this.root == null)
            this.root = new BinarySearchTreeNode<>(value);
        else {
            BinarySearchTreeNode<T> currentNode = this.root;
            while (!Objects.isNull(currentNode)) {
                if (value.compareTo((T) currentNode.getValue()) < 0) {
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(new BinarySearchTreeNode<>(value));
                        currentNode = null;
                    }
                    else
                        currentNode = currentNode.getLeft();
                }
                else {
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(new BinarySearchTreeNode<>(value));
                        currentNode = null;
                    }
                    else
                        currentNode = currentNode.getRight();
                }
            }
        }
    }

    public boolean lookUp(T value) {
        if (this.root == null)
            return false;
        BinarySearchTreeNode<T> currentNode = this.root;
        while (!Objects.isNull(currentNode)) {
            if (value.compareTo((T) currentNode.getValue()) > 0)
                currentNode = currentNode.getRight();
            else if (value.compareTo((T) currentNode.getValue()) < 0)
                currentNode = currentNode.getLeft();
            else
                return true;
        }
        return false;
    }

    private boolean isLeaf(BinarySearchTreeNode<T> node) {
        return Objects.isNull(node.getLeft()) && Objects.isNull(node.getRight());
    }

    public void remove(T value) {
        if (!Objects.isNull(this.root)) {
            BinarySearchTreeNode<T> currentNode = this.root;
            BinarySearchTreeNode<T> parentNode = null;
            while(!Objects.isNull(currentNode)) {
                if (value.compareTo((T) currentNode.getValue()) < 0) {
                    parentNode = currentNode;
                    currentNode = currentNode.getLeft();
                }
                else if (value.compareTo((T) currentNode.getValue()) > 0) {
                    parentNode = currentNode;
                    currentNode = currentNode.getRight();
                }
                else {
                    // Case 1: No right child
                    if (Objects.isNull(currentNode.getRight())) {
                        removeCaseOneNoRightChild(value, currentNode, parentNode);
                        currentNode = null;
                    }
                    // Case 2: Right child without left child
                    else if (Objects.isNull(currentNode.getRight().getLeft())) {
                        removeCaseTwoRightChildWithoutLeftChild(value, currentNode, parentNode);
                        currentNode = null;
                    }
                    // Case 3: Right child with left child
                    else {
                        removeCaseThreeRightChildWithLeftChild(value, currentNode, parentNode);
                        currentNode = null;
                    }
                }
            }
        }
    }

    private void removeCaseOneNoRightChild(T value, BinarySearchTreeNode<T> currentNode, BinarySearchTreeNode<T> parentNode) {
        if (Objects.isNull(currentNode.getRight())) {
            if (Objects.isNull(parentNode)) {
                this.root = currentNode.getLeft();
            }
            else {
                assignRemovedNodeChildToParent(value, parentNode, currentNode.getLeft());
            }
        }
    }

    private void removeCaseTwoRightChildWithoutLeftChild(T value, BinarySearchTreeNode<T> currentNode, BinarySearchTreeNode<T> parentNode) {
        if (Objects.isNull(parentNode)) {
            BinarySearchTreeNode<T> rightChild = currentNode.getRight();
            rightChild.setLeft(currentNode.getLeft());
            this.root = rightChild;
        }
        else {
            BinarySearchTreeNode<T> leftChild = currentNode.getLeft();
            currentNode.getRight().setLeft(leftChild);
            assignRemovedNodeChildToParent(value, parentNode, currentNode.getRight());
        }
    }

    private void removeCaseThreeRightChildWithLeftChild(T value, BinarySearchTreeNode<T> currentNode, BinarySearchTreeNode<T> parentNode) {
        // Find the right child's left most child
        BinarySearchTreeNode<T> leftMost = currentNode.getRight().getLeft();
        BinarySearchTreeNode<T> leftMostParent = currentNode.getRight();
        while (!Objects.isNull(leftMost.getLeft())) {
            leftMostParent = leftMost;
            leftMost = leftMost.getLeft();
        }

        // Leftmost parent's left subtree is assigned the leftmost right subtree
        leftMostParent.setLeft(leftMost.getRight());
        leftMost.setLeft(currentNode.getLeft());
        leftMost.setRight(currentNode.getRight());

        if (Objects.isNull(parentNode)) {
            this.root = leftMost;
        }
        else {
            assignRemovedNodeChildToParent(value, parentNode, leftMost);
        }
    }

    private void assignRemovedNodeChildToParent(T value, BinarySearchTreeNode<T> parentNode, BinarySearchTreeNode<T> nodeToAssign) {
        // If the node to delete is less than the parent node
        if (value.compareTo((T) parentNode.getValue()) < 0) {
            parentNode.setLeft(nodeToAssign);
        }
        // If the node to delete is greater than the parent node
        else if (value.compareTo((T) parentNode.getValue()) > 0) {
            parentNode.setRight(nodeToAssign);
        }
    }

    private Optional<BinarySearchTreeNode<T>> findMin(BinarySearchTreeNode<T> root) {
        if (root == null) {
            return Optional.empty();
        }
        while (!Objects.isNull(root.getLeft())) {
            root = root.getLeft();
        }
        return Optional.of(root);
    }

    private Optional<BinarySearchTreeNode<T>> findMax(BinarySearchTreeNode<T> root) {
        if (root == null) {
            return Optional.empty();
        }
        while (!Objects.isNull(root.getRight())) {
            root = root.getRight();
        }
        return Optional.of(root);
    }

    public List<T> inorder(BinarySearchTreeNode<T> root) {
        List<T> list = new LinkedList<>();
        if (root == null)
            return list;
        if (root.getLeft() != null)
            list.addAll(inorder(root.getLeft()));
        list.add((T) root.getValue());
        if (root.getRight() != null)
            list.addAll(inorder(root.getRight()));
        return list;
    }

}
