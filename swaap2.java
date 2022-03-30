package com.company;


import java.util.Scanner;

class swaap2 {

    public static void main(String args[])
    {

        int a, b, swap;

        System.out.println("Please enter the value of a ");

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        System.out.println("Please enter the value of b ");

        b = sc.nextInt();


        System.out.println("Before swap the value of a is\t" + a);
        System.out.println("Before swap the value of b is\t" + b);


        //System.out.println("Swapping start from here");

        swap = a;
        a = b;
        b = swap;

        System.out.println("After swap the value of a is\t" + a);

        System.out.println("After swap the value of b is\t" + b);


    }


}


