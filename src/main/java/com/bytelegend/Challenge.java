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
        if (str.length() % 2 != 0) {
            int mid = str.length() / 2;
            int i = 0;
            while (i != mid) {
                if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                    return true;
                }
                i++;
            }
        }

        int mid = str.length() / 2;
        int i = 0;
        while (i < mid) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                return true;
            }
            i++;
        }

        return false;
    }
}
