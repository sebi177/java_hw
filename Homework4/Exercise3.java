package Homework4;

import java.util.Scanner;

//      Пользователь вводит с клавиатуры трёхзначное число. Напишите программу,
//      которая считает сумму всех цифр этого числа и выводит её в консоль.

public class Exercise3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a 3 digit number: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of the numbers is: " + sum);

    }
}
