package Homework2;

public class Exercise2 {

    public static void main(String[] args){

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);
        System.out.println(canBuy);

    }
    public static boolean canBuy(boolean a, boolean b){

        boolean canBuy = a || b;
        return canBuy;

    }
}
