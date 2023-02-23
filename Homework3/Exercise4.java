package Homework3;

public class Exercise4 {
    public static void main(String[] args){
        int secondResult = (int) PizzaCalories(24, 28);
        System.out.println(secondResult);
    }

    private static float PizzaCalories(int a, int b) throws NullPointerException {

        float PI = 3.14f;
        int result1 = (int) ((Math.PI * a * a ) / 4);
        int result2 = (int) ((Math.PI * b * b ) / 4);
        int result3 = result2 - result1;
        return result3;
    }
}

