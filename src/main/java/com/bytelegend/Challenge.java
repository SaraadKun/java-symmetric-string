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
        boolean flag = true;
        int start = 0;
        int end = str.length() - 1;
        do {
            if (str.charAt(start) != str.charAt(end) ){
                flag = false;
            }
            start++;
            end--;
            if (start >= end) {
                break;
            }
        } while (flag);
        return flag;
    }
}
