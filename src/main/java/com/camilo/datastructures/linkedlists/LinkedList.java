package com.camilo.datastructures.linkedlists;

public interface LinkedList<T> {
    void insert(T item);
    void insertLast(T item);
    void insertFirst(T item);
    T peakFirst();
    T peakLast();
    T removeFirst();
    T removeLast();
    T remove(T item);
    T removeAt(int index);
    int indexOf(T item);
    boolean isEmpty();
    void clear();
}
