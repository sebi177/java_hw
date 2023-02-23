package Homework2;

public class Exercise1 {

    public static void main(String[] args){

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend || isRain;

        System.out.println(canWalk);

    }
}
