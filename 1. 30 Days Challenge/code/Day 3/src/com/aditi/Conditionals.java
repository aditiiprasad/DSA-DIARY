package com.aditi;


public class Conditionals
{
    public static void main(String[] args)
    {
        // IF ELSE
        int salary = 25400;
        if(salary>10000){
            salary=salary+2000;
                        }
        else {
            salary=salary+1000;
             }
        System.out.println(salary);

        // MULTIPLE IF ELSE
        int pay = 24087;
        if (pay>20000){
            pay += 3000;
        }
        else if (pay>10000) {
            pay += 2000;
        }
        else {
            pay += 1000;
        }
        System.out.println(pay);
    }
}