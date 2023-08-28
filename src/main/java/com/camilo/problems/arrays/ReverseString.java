package com.camilo.problems.arrays;

/**
 * Create a function that reverses a string:
 * 'Hi, my name is Johan' should be:
 * 'nahoJ si eman ym ,iH'
 */
public class ReverseString {

    public static void main(String[] args) {
        String test1 = "Hi, my name is Johan";
        String test2 = "nahoJ si eman ym ,iH";
        String test3 = "--------!";
        String test4 = " ";
        String test5 = "";

        System.out.println(reverseString(test1));
        System.out.println(reverseString(test2));
        System.out.println(reverseString(test3));
        System.out.println(reverseString(test4));
        System.out.println(reverseString(test5));

        System.out.println(reverseStringCharAt(test1));
        System.out.println(reverseStringCharAt(test2));
        System.out.println(reverseStringCharAt(test3));
        System.out.println(reverseStringCharAt(test4));
        System.out.println(reverseStringCharAt(test5));

        System.out.println(reverserStringStringBuilder(test1));
        System.out.println(reverserStringStringBuilder(test2));
        System.out.println(reverserStringStringBuilder(test3));
        System.out.println(reverserStringStringBuilder(test4));
        System.out.println(reverserStringStringBuilder(test5));
    }

    public static String reverseString(String string) {
        String[] charsArray = string.split("");
        String[] reversedArray = new String[charsArray.length];
        for (int i = 1; i <= charsArray.length; i++) {
            reversedArray[i - 1] = charsArray[charsArray.length - i];
        }
        return String.join("", reversedArray);
    }

    public static String reverseStringCharAt(String string) {
        String reversedString = "";
        for (int i = 0; i < string.length(); i++) {
            reversedString = string.charAt(i) + reversedString;
        }
        return reversedString;
    }

    public static String reverserStringStringBuilder(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        return stringBuilder.reverse().toString();
    }

}
