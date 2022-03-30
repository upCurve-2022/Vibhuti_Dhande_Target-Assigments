package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle amount , period and rate of interest respectively : ");
        int p = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int SI = (p*n*r)/100;
        System.out.print("Simple interest = "+SI);
    }
}
