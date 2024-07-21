package com.aditi;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //Print 1 to 5
        /*
        SYNTAX OF FOR LOOP
        for(initialization;condition;increment)
            {body};
         */
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }

        //print 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }

        /* syntax while loops
        initialization
        while(condition)
                  {
                  body
                  increment
                  }
         */
        int number=1;
        while(number<=5){
            System.out.println(number);
            number+=1;
        }

        /* syntax of do while loop
        do{
           body
          }
        while (condition);
         */
        int x = 1;
        do {
            System.out.println(x);
            x++;
        }while(n <= 5);
    }
}
