package Homework6;

import java.util.*;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input length of array: ");
        int N = sc.nextInt();
        System.out.println("Input the number:");
        int K = sc.nextInt();

        System.out.println("Input " + N + " numbers: ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (arr[i] + arr[j] == K) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
