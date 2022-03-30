package com.company;

import java.util.Scanner;

public class separateIntDeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double number :");
        double d = sc.nextDouble();
        int i = (int) d;
        System.out.println("Double number : "+d);
        System.out.println("Integer part : "+i);
        System.out.println("Fraction part : "+(d-i));
    }
}
