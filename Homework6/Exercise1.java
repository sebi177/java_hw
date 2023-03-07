package Homework6;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number a: ");
        int a = scanner.nextInt();

        int[] array = new int[a-1];
        System.out.printf("Input %d numbers from 1 until %d: ", a-1, a);
        for (int i = 0; i < a-1; i++) {
            array[i] = scanner.nextInt();
        }

        int expectedSum = a * (a + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.printf("Missing number is: %d%n", missingNumber);
    }
}
