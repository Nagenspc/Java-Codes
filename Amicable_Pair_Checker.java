import java.util.*;
public class Amicable_Pair_Checker
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number Of The Pair:");
        int Num1 = sc.nextInt();
        System.out.print("Enter The Second Number Of The Pair:");
        int Num2 = sc.nextInt();

        int Sum1 = 0,Sum2 = 0;
        for(int i = 1;i < Num1; i++)
        {
            if(Num1 % i == 0)
            {
//              System.out.print(i);
                Sum1 = Sum1 + i;
            }
        }
        for(int j = 1;j < Num2; j++)
        {
            if(Num2 % j == 0)
            {
//              System.out.println(j);
                Sum2 = Sum2 + j;
            }
        }
//        System.out.println(Sum1);
//        System.out.println(Sum2);
//        System.out.println(Num1);
//        System.out.println(Num2);
        if(Sum2 == Num1 & Sum1 == Num2)
        {
            System.out.println("The Entered Number Pair ("+ Num1+","+Num2 + ") Is Amicable Number Pairs!!");
        }
        else
        {
            System.out.println("The Entered Number Pair ("+Num1+","+Num2 + ") Is Not Amicable Number Pairs!!");
        }
    }
}
