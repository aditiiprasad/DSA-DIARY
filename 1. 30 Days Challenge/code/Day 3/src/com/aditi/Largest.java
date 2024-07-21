package com.aditi;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Find the largest of the three numbers
        int max = a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }

        System.out.println(max);

        int x =3, y=6 , z=0 ;

        int maximum = Math.max(z,Math.max(x,y));
        System.out.println(maximum);
    }
}
