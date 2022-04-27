package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(isSymmetric("1234"));
        System.out.println(isSymmetric("1234321"));
    }

    /**
     * `isSymmetric()` method determines whether a string is a symmetric string.
     *
     * <p>For example, the string "level", "ABCDCBA" is a symmetric string, "ABCD", "DCBA" is not a
     * symmetric string.
     *
     * <p>If the given string is a symmetric string, then return `true`; otherwise, return `false`.
     */
    public static boolean isSymmetric(String str) {
        int len = str.length() - 1;
        int half = len / 2;
        int i = 0;

        boolean returnValue = true;
        while (i < half) {
            if (str.charAt(i) != str.charAt(len - i)) {
                return false;
            }
            i++;
        }

        return returnValue;
    }
}
