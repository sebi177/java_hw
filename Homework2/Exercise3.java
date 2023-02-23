package Homework2;

public class Exercise3 {

    public static void main(String[] args){

        int temperature1 = 109;
        int temperature2 = 99;

        System.out.println(checkTemperature(temperature1, temperature2));
    }
    public static boolean checkTemperature(int Temperature1, int Temperature2) {
        if (Temperature1 > 100 && Temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }
}