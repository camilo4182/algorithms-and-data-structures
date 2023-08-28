package com.camilo.problems;

import java.util.List;

public class SumUpPairMain {

    public static void main(String[] args) {
        List<Integer> a1 = List.of(1, 2, 3, 9);
        List<Integer> a2 = List.of(1, 2, 4, 4);
        List<Integer> a3 = List.of(1, 2, 4, 5, 6, 7, 8, 9);
        List<Integer> a4 = List.of(0, 1, 2, 4, 5, 6, 7, 8, 9, 11, 23);
        List<Integer> a5 = List.of(0, 1, 2, 4, 5, 6, 7, 9, 11, 23);
        List<Integer> a6 = List.of(0, 2, 4, 5, 7, 9, 11, 23);
        List<Integer> a7 = List.of(-2, -1, 0, 2, 4, 5, 7, 9, 11, 23);

        int sum = 8;

        System.out.println(findPair(a1, sum));
        System.out.println(findPair(a2, sum));
        System.out.println(findPair(a3, sum));
        System.out.println(findPair(a4, sum));
        System.out.println(findPair(a5, sum));
        System.out.println(findPair(a6, sum));
        System.out.println(findPair(a7, sum));

    }

    public static boolean findPair(List<Integer> array, int sum) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j) {
            if (array.get(i) + array.get(j) > sum) j--;
            else if (array.get(i) + array.get(j) < sum) i++;
            else return true;
        }
        return false;
    }

}
