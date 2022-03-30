package com.company;

import java.util.Scanner;

public class largestSecLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x>y && x>z){
            System.out.println(" Largest : "+x);
        }
        else if(y>x && y>z){
            System.out.println(" Largest : "+y);
        }
        else if(z>x && z>y){
            System.out.println(" Largest : "+z);
        }
    }
}
