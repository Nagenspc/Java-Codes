import java.util.Scanner;

public class Product_Function
{
    public static int multiply(int num1,int num2)
    {
        int result = num1 * num2;
        return result;
    }
    public static void swap(int num1, int num2)
    {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping The Numbers Are:" + num1 +" "+ num2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers For Multiplication:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int Product = multiply(a,b);
        System.out.println("The Product Is:" + Product);
        System.out.println("Before Swapping The Numbers Are:" + a +" "+ b);
        swap(a,b);
    }
}
