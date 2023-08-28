package com.camilo.datastructures.trees;

public class BinarySearchTreeMain {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        System.out.println(bst.inorder(bst.getRoot()));

        bst.insert(50);
        System.out.println(bst.inorder(bst.getRoot()));

        bst.insert(25);
        bst.insert(75);
        bst.insert(14);
        bst.insert(90);
        bst.insert(2);
        bst.insert(7);
        bst.insert(18);
        bst.insert(19);
        bst.insert(45);
        bst.insert(40);
        bst.insert(1);
        bst.insert(99);
        bst.insert(95);
        bst.insert(70);
        bst.insert(9);
        bst.insert(88);
        bst.insert(66);
        bst.insert(55);
        bst.insert(44);
        bst.insert(33);
        System.out.println(bst.inorder(bst.getRoot()));

        bst.insert(bst.getRoot(), 10);
        bst.insert(bst.getRoot(), 100);
        bst.insert(bst.getRoot(), 23);
        bst.insert(bst.getRoot(), 77);
        bst.insert(bst.getRoot(), 3);
        bst.insert(bst.getRoot(), 4);
        bst.insert(bst.getRoot(), 5);
        bst.insert(bst.getRoot(), 6);
        bst.insert(bst.getRoot(), 8);
        bst.insert(bst.getRoot(), 11);
        bst.insert(bst.getRoot(), 12);
        bst.insert(bst.getRoot(), 20);
        System.out.println(bst.inorder(bst.getRoot()));

        System.out.println(bst.lookUp(11));
        System.out.println(bst.lookUp(1));
        System.out.println(bst.lookUp(100));
        System.out.println(bst.lookUp(50));
        System.out.println(bst.lookUp(13));
        System.out.println(bst.lookUp(-1));

        bst.remove(1);
        System.out.println(bst.inorder(bst.getRoot()));

        bst.remove(50);
        System.out.println(bst.inorder(bst.getRoot()));

        bst.remove(11);
        System.out.println(bst.inorder(bst.getRoot()));
    }

}
