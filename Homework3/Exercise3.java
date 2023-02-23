package Homework3;

public class Exercise3 {

    public static void main(String[] args){

        int euro = 120000;
        System.out.println(euroToDollar(euro));
    }
    public static double euroToDollar(int euro){
        float result = euro * 1.06f;
        return result;
    }
}
