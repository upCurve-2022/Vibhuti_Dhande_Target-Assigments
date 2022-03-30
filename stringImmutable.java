package com.company;

public class stringImmutable {
    public static void refCheck(Object x, Object y) {
        if (x == y) {
            System.out.println("Both pointing to the same reference");

        } else {
            System.out.println("Both are pointing to different reference");
        }
    }
    public static void main(String[] args) {
        String st1 = "Java";
        String st2 = "Java";
        System.out.println("Before Modification in st1");
        refCheck(st1, st2);
        st1 += "ava";
        System.out.println("After Modification");
        refCheck(st1, st2);
    }
}
