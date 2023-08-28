package com.camilo.datastructures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyDynamicArrayTest {

    private MyDynamicArray<Integer> dynamicArray;

    @BeforeEach
    public void setup() {
        dynamicArray = new MyDynamicArray<>();
    }

    @Test
    public void givenArrayJustInstantiated_testInitialState() {
        assertEquals(0, dynamicArray.size());
        assertEquals(5, dynamicArray.getCapacity());
    }

    @Test
    public void givenElementToAppend_whenAppend_thenTheSizeWillIncrease() {
        assertEquals(1, dynamicArray.append(1));
        assertEquals(1, dynamicArray.size());
    }

    @Test
    public void givenInsertedElementAndItsIndex_whenGet_thenItReturnsTheElement() {
        dynamicArray.append(99);

        assertEquals(99, dynamicArray.get(0));
    }

    @Test
    public void givenEmptyArray_whenGet_thenItThrowsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> dynamicArray.get(0));
    }

    @Test
    public void givenArrayWithElementsAndIndexGreaterThanSize_whenGet_thenItThrowsException() {
        dynamicArray.append(1);
        dynamicArray.append(2);

        assertThrows(IndexOutOfBoundsException.class, () -> dynamicArray.get(2));
    }

    @Test
    public void givenTwoElementsToAppend_whenAppend_thenTheSizeWillIncreaseTwice() {
        assertEquals(100, dynamicArray.append(100));
        assertEquals(1, dynamicArray.size());

        assertEquals(120, dynamicArray.append(120));
        assertEquals(2, dynamicArray.size());

        assertEquals(100, dynamicArray.get(0));
        assertEquals(120, dynamicArray.get(1));
    }

    @Test
    public void givenElementsToAppend_whenAppendAndReachedCapacity_thenCapacityWillDoubleAndElementsWillBeInserted() {
        dynamicArray.append(1);
        dynamicArray.append(2);
        dynamicArray.append(3);
        dynamicArray.append(4);
        dynamicArray.append(5);

        assertEquals(5, dynamicArray.size());
        assertEquals(10, dynamicArray.getCapacity());
    }

    @Test
    public void givenArrayWithElements_whenPop_thenItDeletesAndReturnsTheLastElement() {
        dynamicArray.append(1);
        dynamicArray.append(2);
        dynamicArray.append(3);
        dynamicArray.append(4);
        dynamicArray.append(5);

        assertEquals(5, dynamicArray.size());
        assertEquals(5, dynamicArray.pop());
        assertEquals(4, dynamicArray.size());
    }

}
