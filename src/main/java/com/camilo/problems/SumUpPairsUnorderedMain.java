package com.camilo.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumUpPairsUnorderedMain {

    public static void main(String[] args) {
        List<Integer> a1 = List.of(4, 1, 0, 5, 4);
        List<Integer> a2 = List.of(4, 1, 0, 5, 4, -4);
        List<Integer> a3 = List.of(4, 1, 0, 5, 5);
        List<Integer> a4 = List.of(8, 1, 0, 5, 4);
        List<Integer> a5 = List.of(4, 1, 0, 5, -4, 12, 2, 45);
        List<Integer> a6 = List.of(9, 1, 0, 5, 4, -22, 0, 2, 11);
        List<Integer> a7 = List.of(7, 1, 0, 5, 4, -22, 0, 2, 11);

        int sum = 8;

        System.out.println(findPairsInUnordered(a1, sum));
        System.out.println(findPairsInUnordered(a2, sum));
        System.out.println(findPairsInUnordered(a3, sum));
        System.out.println(findPairsInUnordered(a4, sum));
        System.out.println(findPairsInUnordered(a5, sum));
        System.out.println(findPairsInUnordered(a6, sum));
        System.out.println(findPairsInUnordered(a7, sum));

    }

    public static boolean findPairsInUnordered(List<Integer> array, int sum) {
        Set<Integer> complements = new HashSet<>();
        for (Integer n : array) {
            if (complements.contains(n)) return true;
            complements.add(sum - n);
        }
        return false;
    }

}
