package Homework4;

import java.util.Scanner;

//        Создайте целочисленную переменную, в которую можно записывать порядковый номер месяца.
//        Напишите программу, которая в зависимости
//        от значения переменной выводит название этого месяца и название времени года этого месяца.
public class Exercise1 {

    public static void main(String[] args) {

        int monthNumber = 9;

        String monthName = "";
        String season = "";
        switch (monthNumber) {
            case 1:
                monthName = "January";
                season = "Winter";
                break;
            case 2:
                monthName = "February";
                season = "Winter";
                break;
            case 3:
                monthName = "March";
                season = "Spring";
                break;
            case 4:
                monthName = "April";
                season = "Spring";
                break;
            case 5:
                monthName = "May";
                season = "Spring";
                break;
            case 6:
                monthName = "June";
                season = "Summer";
                break;
            case 7:
                monthName = "July";
                season = "Summer";
                break;
            case 8:
                monthName = "August";
                season = "Summer";
                break;
            case 9:
                monthName = "September";
                season = "Autumn";
                break;
            case 10:
                monthName = "October";
                season = "Autumn";
                break;
            case 11:
                monthName = "November";
                season = "Autumn";
                break;
            case 12:
                monthName = "December";
                season = "Winter";
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }

        System.out.println("Month: " + monthName);
        System.out.println("Season: " + season);

    }
}