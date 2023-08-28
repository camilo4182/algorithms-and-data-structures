package com.camilo.datastructures.trees;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class BinarySearchTreeNode <T> {

    private Object value;
    private BinarySearchTreeNode<T> left;
    private BinarySearchTreeNode<T> right;

    public BinarySearchTreeNode(Object value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

}
