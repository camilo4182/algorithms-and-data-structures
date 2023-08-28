package com.camilo.datastructures.arrays;

public interface Array <E> {

    E get(int index);
    E append(E element);
    E replace(int index, E element);
    E pop();
    boolean isEmpty();

}
