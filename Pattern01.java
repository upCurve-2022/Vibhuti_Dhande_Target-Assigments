package com.company;

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter number of rows : ");
        int a= sc.nextInt();
        //int i =0;
        //int j=0;
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
