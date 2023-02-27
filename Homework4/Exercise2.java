package Homework4;

import java.util.Random;

//        Создать программу, выводящую на экран случайно сгенерированное
//        трёхзначное натуральное число и его наибольшую цифру.

public class Exercise2 {

    public static void main(String[] args) {

        Random number = new Random();
        int a = number.nextInt(100, 1000);
        int max = 0;

        System.out.println("The random number generated is: " + a + "\n");

        String s = Integer.toString(a);
        char[] list = s.toCharArray();

        for (char element : list) {
            int digit = Character.getNumericValue(element);
            if (digit > max) {
                max = digit;
            }

            System.out.println("Current checking the digit : " + digit);

        }

        System.out.println("\nMaximum digit is: " + max);

    }
}