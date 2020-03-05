package com.company;

public class Task1 {

    public static void task1() {
        System.out.print("Введите число и нажмите \"Enter\": ");
        int number = ConsoleHelper.readInt();
        evenOddNumber(number);
    }


    public static String isPrime(int number) {
        if (number < 2) {
            return number + " не относится к простому и составному числу";

        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return number + " является составным числом";

            }
        }
        return number + " является простым числом";

    }

    public static void evenOddNumber(int number) {
        if (number == 0) {
            System.out.println(number + " не относится к четным и нечетным числам");
        } else if (number % 2 == 0) {
            System.out.println(number + " четное число");
        } else {
            System.out.println(number + " нечетное число");
        }
    }
}
