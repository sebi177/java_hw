package Homework2;

import java.util.Random;

public class Exercise5 {

    public static void main(String[] args){
        int numOfStudents = 18;
        System.out.println(getRandomStudentNumber(numOfStudents));
    }

    public static int getRandomStudentNumber(int numberOfStudents) {
        Random random = new Random();
        return random.nextInt(numberOfStudents - 1) + 2;
    }
}
