package com.company;

import java.util.Scanner;

public class myPower {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value and power value : ");
        int base = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        // running loop while the power > 0
        while (power != 0) {
            result = result * base;
            // power will get reduced after
            // each multiplication
            power--;
        }
        System.out.println("Result =  " + result);
    }

}

