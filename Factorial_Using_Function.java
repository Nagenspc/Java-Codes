import java.util.Scanner;

public class Factorial_Using_Function {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Positive Number:");
        int Number = sc.nextInt();

        int result = factorial(Number);
        System.out.println("The Factorial Of The Given Number " + Number + " Is:" + result);

    }
}
