package com.camilo.datastructures.linkedlists;

import lombok.Getter;

@Getter
public class SinglyLinkedList<T> implements LinkedList<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;

    public SinglyLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public void insert(T item) {

    }

    @Override
    public void insertLast(T item) {

    }

    @Override
    public void insertFirst(T item) {

    }

    @Override
    public T peakFirst() {
        return null;
    }

    @Override
    public T peakLast() {
        return null;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T remove(T item) {
        return null;
    }

    @Override
    public T removeAt(int index) {
        return null;
    }

    @Override
    public int indexOf(T item) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Getter
    private static class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
