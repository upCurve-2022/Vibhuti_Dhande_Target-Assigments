import java.util.Scanner;

public class discount {
    public static void main(String args[])
    {

        double  dis,amount,mp,s;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter markedprice ");

        mp=sc.nextDouble();

        System.out.println("enter discount percentage ");

        dis=sc.nextDouble();

        s=100-dis;

        amount= (s*mp)/100;

        System.out.println("amount after discount="+amount);

    }
}
