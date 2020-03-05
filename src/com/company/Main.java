package com.company;

public class Main {
    public static void main(String[] args) {

        //test NOD
        System.out.println(NokAndNod.gcd(10, 24));
        System.out.println(NokAndNod.gcd(12, 24));
        System.out.println(NokAndNod.gcd(11, 24));

        //test NOK
        System.out.println(NokAndNod.lcm(3, 4));//результат: 12
        System.out.println(NokAndNod.lcm(3, 9));//результат: 9
        System.out.println(NokAndNod.lcm(5, 12));//результат: 60

        //words count
        WordCounter.counterWords();

//        CountWordInText
        CountWordInText.countWordInText();

        //palindrome
        Palindrome.palindrome();

        //task1
        Task1.task1();
        Task1.evenOddNumber(10);
        Task1.isPrime(49);

    }
}
