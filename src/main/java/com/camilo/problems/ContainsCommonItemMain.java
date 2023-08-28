package com.camilo.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsCommonItemMain {

    public static void main(String[] args) {
        List<Object> ar1 = List.of('a', 'b', 'x', 'c', 'f');
        List<Object> ar2 = List.of('z', 'g', 'y');

        System.out.println(containsCommonItem(ar1, ar2));
    }

    public static boolean containsCommonItem(List<Object> array1, List<Object> array2) {
        Set<Object> array1ElementsHashSet =  new HashSet<>(array1);
        for (Object array2Element : array2) {
            if (array1ElementsHashSet.contains(array2Element)) return true;
        }
        return false;
    }

}
