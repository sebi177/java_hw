package Homework3;

import java.util.Scanner;

public class Exercise1 {

        public static void main(String[] args){
            Scanner scanner = new
                    Scanner(System.in);
            System.out.println("Input 2 Words: ");

            String word1 = scanner.next();
            String word2 = scanner.next();
            int lenght1 = word1.length();
            int lenght2 = word2.length();
            if (lenght1 % 2 == 0 && lenght2 % 2 == 0){
                String result = word1.substring(0,lenght1 / 2) + word2.substring(lenght2 / 2);
                System.out.println(result);
            } else {
                System.out.println("Words can not be devided with 2");
            }
        }
    }
