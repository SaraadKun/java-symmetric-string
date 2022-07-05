package com.bytelegend;

import java.util.Arrays;

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
        if (str == null || str.length() < 2) {
            return false;
        }
        char[] whole = str.toCharArray();
        char[] part1, part2;
        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length()/2; i++){
                part1[i] = whole[i];
                part2[i] = whole[str.length() - i - 1];
            }
            return Arrays.equals(part1, part2);
        }
        if (str.length() % 2 == 1) {
            for (int i = 0; i < (str.length()/2) + 1; i++){
                part1[i] = whole[i];
                part2[i] = whole[str.length() - i - 1];
            }
            return Arrays.equals(part1, part2);
        }
        return false;
    }
}
