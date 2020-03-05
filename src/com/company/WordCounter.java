package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class WordCounter {

    public static void counterWords(){
        System.out.println("Введите предложение");
        String str = ConsoleHelper.readString();
        String [] arrStr = str.split(" ");
        Arrays.sort(arrStr);

        System.out.println("Всего слов = " + arrStr.length);

        String res =  "";
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() > 1) {
                res += arrStr[i].substring(0,1).toUpperCase() + arrStr[i].substring(1,arrStr[i].length()) + " ";
            }
        }
        System.out.println(res);
    }
}
