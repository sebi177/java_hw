package Homework3;

public class Exercise2 {
    public static void main(String[] args){

        int number1 = 109;
        int number2 = 32;

        System.out.println(number1 + " + " + number2 + " = " +additionTwoNumbers(number1, number2));
        System.out.println(number1 + " - " + number2 + " = " +subtractionTwoNumbers(number1, number2));
        System.out.println(number1 + " * " + number2 + " = " +multiplicationTwoNumbers(number1, number2));
        System.out.println(number1 + " / " + number2 + " = " +divisionTwoNumbers(number1, number2));
    }

    public static int additionTwoNumbers(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static int subtractionTwoNumbers(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    public static int multiplicationTwoNumbers(int num1, int num2){
        int result = num1 * num2;
        return result;
    }

    public static double divisionTwoNumbers(int num1, int num2){
        float result = (float) num1 / num2;
        return result;
    }

}
