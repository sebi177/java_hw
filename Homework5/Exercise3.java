package Homework5;

public class Exercise3 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 20; i <= 60; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Сумма нечётных чисел от 20 до 60 = " + sum);
    }
}