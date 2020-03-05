package com.company;

import java.util.Arrays;

public class CountWordInText {

    public static void countWordInText(){
        System.out.println("Введите предложение");
        String text = ConsoleHelper.readString().toLowerCase();
        System.out.println("Введите слово которое будете считать");
        String word = ConsoleHelper.readString();
        String[] splited = text.split("\\b+");
       long res = Arrays.asList(splited).stream().filter(x -> x.contains(word)).count();
        System.out.println("Колличество совпадающих слов = " + res);

    }
}
