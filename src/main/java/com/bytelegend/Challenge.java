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
        int l = str.length();
        char[] c = str.toCharArray();
        int i = 0;
        boolean flag = true;
        do {
            if (c[i] == c[l - 1]) {
                i++;
                l--;
            } else {
                flag = false;
            }
        } while (i != l && (i + 1) != l && flag);
        return flag;

    }
}
