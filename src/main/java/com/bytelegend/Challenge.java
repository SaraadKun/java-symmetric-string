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
        int x = str.length();
        int k = 0;
        if (x % 2 == 0) {

            String s = str.substring(0, str.length() / 2);
            String t = str.substring(str.length() / 2);
            System.out.println(s);
            System.out.println(t);
            char[] ss = s.toCharArray();
            char[] sc = t.toCharArray();
            for (int i = 0; i < sc.length; i++) {
                if (ss[i] != sc[sc.length - i - 1]) {
                    k++;
                }
            }
            return k == 0;
        } else {
            String y = str.substring(0, str.length() / 2);
            String z = str.substring(str.length() / 2 + 1);
            char[] ss = y.toCharArray();
            char[] sc = z.toCharArray();
            for (int i = 0; i < sc.length; i++) {
                if (ss[i] != sc[sc.length - i - 1]) {
                    k++;
                }
            }
            return k == 0;
        }
    }
}
