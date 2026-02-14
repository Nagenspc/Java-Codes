import java.util.*;
public class Multiplication_Table
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number For Printing The Multiplication Table:");
        int Choice = sc.nextInt();
        System.out.println(" Multiplication Table Of The Entered Number " + Choice + " Is:");
        for(int i = 1; i <= 10 ; i++)
        {
           System.out.println(Choice + "*" + i + "=" + Choice * i) ;
        }

    }
}
