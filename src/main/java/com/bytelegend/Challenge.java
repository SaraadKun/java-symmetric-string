package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(isSymmetric("1234"));
        System.out.println(isSymmetric("ABCDDCBA"));
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
        if (str == null)
            return false;
        if (str.equals("") || str.length() == 1)
            return true;
        if(str.length()%2==0){
            return false;
        }
         else {
            char ch[] = str.toCharArray();
            int n = str.length();
            for (int i = 0; i < n; i++) {
                if (ch[i] != ch[n - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
