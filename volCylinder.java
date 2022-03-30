import java.util.Scanner;

public class volCylinder {
    public static void main(String args[])
    {
        int height, radius;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter height and radius");
        height = sc.nextInt();
        radius = sc.nextInt();

        double pie=3.14285714286;
        double volume=pie*(radius*radius)*height;
        System.out.println("Volume of the cylinder="+volume);
    }
}
