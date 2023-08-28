package com.camilo.datastructures.builtinlinkedlists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListsPractice {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();

        System.out.printf("There are %s elements in this list.%n", integers.size());
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.addFirst(0);
        integers.addLast(100);
        printListElements(integers);
        System.out.printf("There are %s elements in this list.%n", integers.size());

        System.out.println("First element (head): " + integers.peek());
        System.out.println("First element (head): " + integers.peekFirst());
        System.out.println("Last element (tail): " + integers.peekLast());

        System.out.println("Head removed: " + integers.pop());

        System.out.printf("There are %s elements in this list.%n", integers.size());
        printListElements(integers);

        removeAllLinkedListElementsOneByOne(integers);

        System.out.printf("There are %s elements in this list.%n", integers.size());
        printListElements(integers);

    }

    public static <T> void printListElements(List<T> list) {
        for (T o : list) {
            System.out.println(o.toString());
        }
    }

    public static <T> void removeAllLinkedListElementsOneByOne(LinkedList<T> list) {
        while (!list.isEmpty()) {
            System.out.println("Removed element: " + list.pop());
        }
    }

}
