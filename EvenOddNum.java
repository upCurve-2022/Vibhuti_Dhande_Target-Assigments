package com.company;

import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        if(x == 0){
            System.out.print("The number is neither even nor odd");
        }
        else if( x % 2 == 0){
            System.out.print("The number is even");
        }

        else{
            System.out.print("The number is odd");
        }

    }
}
