package com.company;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Palindrome {

    public static void palindrome(){
        Predicate<Integer> palindromePredicate = x -> x == IntStream.iterate(x, n -> n != 0, i -> i / 10) .map(n -> n % 10) .reduce(0, (a, b) -> a * 10 + b);

        System.out.println("Введите число не больше 100");
        int n = ConsoleHelper.readInt();
        if (n > 100) {
            palindrome();
        }
        Stream.iterate(0, i -> i + 1)
                .limit(n)
                .filter(x -> !(x >= 0 && x <=10))
                .filter(palindromePredicate)
                .forEach(System.out::println);
    }

}
