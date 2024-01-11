package com.campus.functional;

import java.util.function.Function;

public class FunctionalPractice {
    public static void main(String[] args) {
        Function<Integer, Boolean> happyJudge = FunctionalPractice::isHappyNumber;

        System.out.println("is 2 happy? " + happyJudge.apply(2));
        System.out.println("is 19 happy? " + happyJudge.apply(19));
    }

    public static boolean isHappyNumber(int num) {
        if (num < 1)
            throw new IllegalArgumentException("number is out of bound[1, 2^23-1]!");
        int sum = String.valueOf(num).chars()
                .map(i -> i - 48)
                .map(i -> i * i)
                .sum();
        if (sum > 9)
            return isHappyNumber(sum);
        return sum == 1;
    }
}