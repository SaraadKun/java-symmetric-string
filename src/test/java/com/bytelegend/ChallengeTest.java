package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChallengeTest {
    @Test
    public void test() {
        int n = new Random().nextInt(50) + 50;
        String str =
                IntStream.range(n, n + 10)
                        .mapToObj(i -> String.format("%c", i))
                        .collect(Collectors.joining(""));
        Assertions.assertTrue(Challenge.isSymmetric(str + new StringBuilder(str).reverse()));
        Assertions.assertFalse(
                Challenge.isSymmetric(str + new StringBuilder(str).reverse() + "111"));
    }
}
