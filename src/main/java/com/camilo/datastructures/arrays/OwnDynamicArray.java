package com.camilo.datastructures.arrays;

import java.util.Objects;

@SuppressWarnings("unchecked")
public class OwnDynamicArray<E> implements Array<E> {

    private int capacity;
    private int size;
    private E[] array;

    public OwnDynamicArray() {
        this.capacity = 5;
        this.size = 0;
        this.array = (E[]) new Object[capacity];
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        return array[index];
    }

    @Override
    public E append(E element) {
        if (size + 1 >= capacity) {
            grow(array);
        }
        array[size] = element;
        size++;
        return element;
    }

    private void grow(E[] array) {
        E[] newArray = (E[]) new Object[capacity*2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        capacity *= 2;
        this.array = newArray;
    }

    @Override
    public E replace(int index, E element) {
        Objects.checkIndex(index, size);
        array[index] = element;
        return array[index];
    }

    @Override
    public E pop() {
        E removedElement = array[size - 1];
        array[size - 1] = null;
        size--;
        return removedElement;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

}
