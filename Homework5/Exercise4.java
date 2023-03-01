package Homework5;

public class Exercise4 {

    public static void main(String[] args) {

        System.out.println(numberOfLifts(200, 50, 1));
    }
        public static int numberOfLifts ( int floors, int stepUp, int stepDown){
            int currentFloor = 0;
            int lifts = 0;
            while (currentFloor < floors) {
                currentFloor += stepUp;
                lifts++;
                if (currentFloor >= floors) {
                    break;
                }
                currentFloor -= stepDown;
            }
            return lifts;
        }
    }
