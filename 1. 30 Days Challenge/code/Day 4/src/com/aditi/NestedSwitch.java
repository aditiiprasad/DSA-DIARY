package com.aditi;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();


        switch (empID){
            case 1:
                System.out.println("Aditi");
                break;
            case 2:
                System.out.println("Monosoni");
                break;
            case 3:
                System.out.println("Horshita");
                break;
            case 4:
                System.out.println("empID 4");
                String department= in.next();
                switch (department){
                    case "IT" :
                        System.out.println("IT DEPARTMENT");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                    default:
                        System.out.println("no dept");
                }

            default:
                System.out.println("Enter correct ID");
        }
    }

}
