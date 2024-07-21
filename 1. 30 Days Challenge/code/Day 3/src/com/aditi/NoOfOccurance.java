package com.aditi;

import java.util.Scanner;

public class NoOfOccurance {
    public static void main(String[] args) {
        int n = 437266;

        int count = 0;
        while (n>0){
            int rem = n%10;
            if (rem == 6){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);
    }
}
