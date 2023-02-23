package Homework2;

public class Exercise4 {

    public static void main(String[] args){

        int time = 8523;
        System.out.println(time);

        if (time == 28800){
            System.out.println("8 hours left!");
        }
        if (time >= 25200 && time < 28800){
            System.out.println("7 hours left!");
        }
        if (time >= 21600 && time < 25200){
                    System.out.println("6 hours left!");
        }
        if (time >= 18000 && time < 21600){
            System.out.println("5 hours left!");
        }
        if (time >= 14400 && time < 18000){
            System.out.println("5 hours left!");
        }
        if (time >= 10800 && time < 14400){
            System.out.println("4 hours left!");
        }
        if(time >= 7200 && time < 10800){
            System.out.println("3 hours left");
        }
        if (time >= 3600 && time < 7200){
            System.out.println("2 hours left!");
        }
        if (time >= 1 && time < 3600){
            System.out.println("1 hour left!");
        }
        if (time == 0){
            System.out.println("0 hours left!");
        }
    }
}
