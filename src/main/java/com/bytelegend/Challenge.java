package com.bytelegend;

import java.util.stream.IntStream;

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
        if (str == null) {
            return false;
        }
        return IntStream.range(0, str.length() / 2)
                .filter(i -> str.charAt(i) != str.charAt(str.length() - 1 - i))
                .parallel()
                .findAny()
                .isEmpty();
    }
}
