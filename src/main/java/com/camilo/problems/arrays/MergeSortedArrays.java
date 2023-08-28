package com.camilo.problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {

    public static void main(String[] args) {
        List<Integer> arrayTest1A = List.of(1, 3, 5, 7, 10);
        List<Integer> arrayTest1B = List.of(13, 20, 25, 70, 100, 101);

        List<Integer> arrayTest2A = List.of(13, 20, 25, 70, 100, 101);
        List<Integer> arrayTest2B = List.of(1, 3, 5, 7, 10);

        List<Integer> arrayTest3A = List.of(50, 51);
        List<Integer> arrayTest3B = List.of(1, 2, 5, 10);

        List<Integer> arrayTest4A = List.of(1, 2, 5, 10);
        List<Integer> arrayTest4B = List.of(50, 51);

        List<Integer> arrayTest5A = List.of(1, 5, 7, 10);
        List<Integer> arrayTest5B = List.of(2, 3, 4, 6, 8, 9, 11);

        List<Integer> arrayTest6A = List.of(2, 3, 4, 6, 8, 9, 11);
        List<Integer> arrayTest6B = List.of(1, 5, 7, 10);

        List<Integer> arrayTest7A = List.of(2, 3, 4, 6, 8, 9, 11);
        List<Integer> arrayTest7B = List.of(1, 1, 5, 7, 10);

        List<Integer> arrayTest8A = List.of(2, 3, 4, 6, 8, 8, 8, 9, 11);
        List<Integer> arrayTest8B = List.of(1, 1, 5, 7, 10, 10);

        List<Integer> arrayTest9A = List.of(2, 3, 4, 6, 8, 8, 8, 9, 10, 11);
        List<Integer> arrayTest9B = List.of(1, 1, 5, 7, 10, 10);

        List<Integer> arrayTest10A = List.of();
        List<Integer> arrayTest10B = List.of(1, 1, 5, 7, 10, 10);

        List<Integer> arrayTest11A = List.of(2, 3, 4, 6, 8, 8, 8, 9, 10, 11);
        List<Integer> arrayTest11B = List.of();

        List<Integer> arrayTest12A = List.of();
        List<Integer> arrayTest12B = List.of();

        List<Integer> arrayTest13A = List.of(2, 3, 4, 6, 8, 8, 8, 9, 10, 11);
        List<Integer> arrayTest13B = List.of(2, 3, 4, 6, 8, 8, 8, 9, 10, 11);

        List<Integer> arrayTest14A = List.of(1);
        List<Integer> arrayTest14B = List.of(2, 3, 4, 6, 8, 8, 8, 9, 10, 11);

        List<Integer> arrayTest15A = List.of(100);
        List<Integer> arrayTest15B = List.of(2, 3, 4, 6, 8, 8, 8, 9, 10, 11);

        List<Integer> arrayTest16A = List.of(2, 3, 4, 6, 8, 8, 8, 9, 10, 11);
        List<Integer> arrayTest16B = List.of(1);

        List<Integer> arrayTest17A = List.of(2, 3, 4, 6, 8, 8, 8, 9, 10, 11);
        List<Integer> arrayTest17B = List.of(100);

        List<Integer> arrayTest18A = List.of(1);
        List<Integer> arrayTest18B = List.of(1);

        List<Integer> arrayTest19A = List.of(1);
        List<Integer> arrayTest19B = List.of(2);

        List<Integer> arrayTest20A = List.of(2);
        List<Integer> arrayTest20B = List.of(1);

        List<Integer> arrayTest21A = List.of(1);
        List<Integer> arrayTest21B = List.of(-1);

        List<Integer> arrayTest22A = List.of(0, 1);
        List<Integer> arrayTest22B = List.of(-1);

        List<Integer> arrayTest23A = List.of(-1);
        List<Integer> arrayTest23B = List.of(1);

        List<Integer> arrayTest24A = List.of(-1);
        List<Integer> arrayTest24B = List.of(0, 1);

        List<Integer> arrayTest25A = List.of(-7, -5, -2, -1, 0);
        List<Integer> arrayTest25B = List.of(-6, -4, -3, 1, 2, 100);

        List<Integer> arrayTest26A = List.of(-6, -4, -3, 1, 2, 100);
        List<Integer> arrayTest26B = List.of(-7, -5, -2, -1, 0);

        List<Integer> arrayTest27A = List.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1);
        List<Integer> arrayTest27B = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(mergeSortedArrays(arrayTest1A, arrayTest1B));
        System.out.println(mergeSortedArrays(arrayTest2A, arrayTest2B));
        System.out.println(mergeSortedArrays(arrayTest3A, arrayTest3B));
        System.out.println(mergeSortedArrays(arrayTest4A, arrayTest4B));
        System.out.println(mergeSortedArrays(arrayTest5A, arrayTest5B));
        System.out.println(mergeSortedArrays(arrayTest6A, arrayTest6B));
        System.out.println(mergeSortedArrays(arrayTest7A, arrayTest7B));
        System.out.println(mergeSortedArrays(arrayTest8A, arrayTest8B));
        System.out.println(mergeSortedArrays(arrayTest9A, arrayTest9B));
        System.out.println(mergeSortedArrays(arrayTest10A, arrayTest10B));
        System.out.println(mergeSortedArrays(arrayTest11A, arrayTest11B));
        System.out.println(mergeSortedArrays(arrayTest12A, arrayTest12B));
        System.out.println(mergeSortedArrays(arrayTest13A, arrayTest13B));
        System.out.println(mergeSortedArrays(arrayTest14A, arrayTest14B));
        System.out.println(mergeSortedArrays(arrayTest15A, arrayTest15B));
        System.out.println(mergeSortedArrays(arrayTest16A, arrayTest16B));
        System.out.println(mergeSortedArrays(arrayTest17A, arrayTest17B));
        System.out.println(mergeSortedArrays(arrayTest18A, arrayTest18B));
        System.out.println(mergeSortedArrays(arrayTest19A, arrayTest19B));
        System.out.println(mergeSortedArrays(arrayTest20A, arrayTest20B));
        System.out.println(mergeSortedArrays(arrayTest21A, arrayTest21B));
        System.out.println(mergeSortedArrays(arrayTest22A, arrayTest22B));
        System.out.println(mergeSortedArrays(arrayTest23A, arrayTest23B));
        System.out.println(mergeSortedArrays(arrayTest24A, arrayTest24B));
        System.out.println(mergeSortedArrays(arrayTest25A, arrayTest25B));
        System.out.println(mergeSortedArrays(arrayTest26A, arrayTest26B));
        System.out.println(mergeSortedArrays(arrayTest27A, arrayTest27B));
    }

    /**
     * Temporay complexity = O(A + B)
     * Spacial complexity = O(A + B)
     * @param array1 - first ordered array
     * @param array2 - second ordered array
     * @return merged ordered array
     */
    public static List<Integer> mergeSortedArrays(List<Integer> array1, List<Integer> array2) {
        List<Integer> mergedArray = new ArrayList<>();

        int array1Element = 0;
        int array2Element = 0;

        int i = 0;
        int j = 0;
        while (i < array1.size() || j < array2.size()) {

            if (i < array1.size()) array1Element = array1.get(i);
            if (j < array2.size()) array2Element = array2.get(j);

            if ((array1Element < array2Element && i < array1.size()) || j > array2.size() - 1) {
                mergedArray.add(array1Element);
                i++;
            } else {
                mergedArray.add(array2Element);
                j++;
            }
        }
        return mergedArray;
    }

}
