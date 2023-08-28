package com.camilo.problems.hashtable;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class FirstRecurringCharacter {

    public static void main(String[] args) {
        List<Integer> test1 = List.of(2, 5, 1, 2, 3, 5, 1, 2, 4);
        List<Integer> test2 = List.of(2, 1, 1, 2, 3, 5, 1, 2, 4);
        List<Integer> test3 = List.of(2, 3, 5, 4);
        List<Integer> test4 = List.of(8);
        List<Integer> test5 = List.of(8, 8);
        List<Integer> test6 = List.of(2, 1, 8, 6, 3, 5, 0, 9, 9);
        List<Integer> test7 = List.of(2, 1, 8, 6, 3, 5, 9, 0, 9);

        System.out.println(findFirstRecurringCharacter(test1));
        System.out.println(findFirstRecurringCharacter(test2));
        System.out.println(findFirstRecurringCharacter(test3));
        System.out.println(findFirstRecurringCharacter(test4));
        System.out.println(findFirstRecurringCharacter(test5));
        System.out.println(findFirstRecurringCharacter(test6));
        System.out.println(findFirstRecurringCharacter(test7));

        System.out.println();

        System.out.println(findFirstRecurringCharacterDoubleLoop(test1));
        System.out.println(findFirstRecurringCharacterDoubleLoop(test2));
        System.out.println(findFirstRecurringCharacterDoubleLoop(test3));
        System.out.println(findFirstRecurringCharacterDoubleLoop(test4));
        System.out.println(findFirstRecurringCharacterDoubleLoop(test5));
        System.out.println(findFirstRecurringCharacterDoubleLoop(test6));
        System.out.println(findFirstRecurringCharacterDoubleLoop(test7));
    }

    public static Integer findFirstRecurringCharacter(List<Integer> array) {
        Set<Integer> numbers = new HashSet<>();
        for (int i : array) {
            if (numbers.contains(i))
                return i;
            numbers.add(i);
        }
        return null;
    }

    public static Integer findFirstRecurringCharacterDoubleLoop(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (Objects.equals(array.get(i), array.get(j))) {
                    return array.get(i);
                }
                else if ((j + 1) < array.size() && Objects.equals(array.get(j), array.get(j + 1))) {
                    return array.get(j);
                }
            }
        }
        return null;
    }

}
