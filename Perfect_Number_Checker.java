import java.util.*;
public class Perfect_Number_Checker
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number For Checking Perfect Or Not:");
        int Number = sc.nextInt();
        System.out.println("Checking........");

        int Sum = 0;
        for (int i = 1; i < Number; i++)
        {
            if(Number % i == 0)
            {
                //System.out.println(i);
                Sum = Sum + i;
            }
        }
        //System.out.println(Sum);
        if(Sum == Number)
        {
            System.out.println("The Entered Number " + Number + " Is A Perfect Number!!");
        }
        else
        {
            System.out.println("The Entered Number " + Number + " Is Not A Perfect Number");
        }



    }
}
