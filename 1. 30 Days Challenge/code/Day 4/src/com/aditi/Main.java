package com.aditi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //OLD STYLE
        Scanner in = new Scanner(System.in);
        System.out.print("NAME OF THE FRUIT - ");
        String fruit = in.next();

        switch (fruit) {
            case "Mango" :
                System.out.println("King");
                break;
            case "Apple" :
                System.out.println("Red");
                break;
            case "Grapes" :
                System.out.println("Sour");
                break;
            default:
                System.out.println("wrong");
        }

        //NEW STYLE
        Scanner input = new Scanner(System.in);
        System.out.print("day number - ");
        int day = in.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        //






    }

}
