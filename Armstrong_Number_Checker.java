import java.util.*;

public class Armstrong_Number_Checker
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter A Number For Checking Armstrong Number:");
       int Number = sc.nextInt();

       int Prev_Number = Number;
       int Original_Number = Number;

       int Reminder,Sum = 0;
       int Length_of_num = 0;
       int Last_Digit;
       while(Number > 0)
       {
           Reminder = Number % 10;
           Length_of_num += 1;
           Number = Number / 10;
       }
       //System.out.println("The Length Of The Entered Number Is:" + Length_of_num);
       for(int j = 1; j <= Length_of_num;j++)
       {
           Last_Digit = Prev_Number % 10;
           Sum = Sum + (int) Math.pow(Last_Digit,Length_of_num);
           Prev_Number = Prev_Number / 10;
       }
       //System.out.println(Sum);
       if(Sum == Original_Number)
       {
           System.out.println("The Entered Number "+ Original_Number + " Is A Armstrong Number");
       }
       else
       {
           System.out.println("The Entered Number "+ Original_Number + " Is Not A Armstrong Number");
       }
    }
}
