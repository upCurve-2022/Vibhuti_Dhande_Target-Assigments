package com.company;

public class emptyString {
    public static boolean isStringNull(String str)
    {

        // Compare the string with null
        // using == relational operator
        // and return the result
        if (str == null)
            return true;
        else
            return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str1 = "Target Upcurve";
        String str2 = null;

        System.out.println("Is string [" + str1
                + "] null? "
                + isStringNull(str1));
        System.out.println("Is string [" + str2
                + "] null? "
                + isStringNull(str2));
    }
}
