import java.util.Scanner;

public class Calculate_Binomial_Coffnt {
    public static int factorial(int Number) {
        int fact = 1;
        for (int i = 1; i <= Number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binaomial_Coffecient(int n, int r) {
        int Factorial_Of_n = factorial(n);
        int Factorial_of_r = factorial(r);
        int Factorial_of_nr = factorial(n - r);
        int bincoffe = (Factorial_Of_n) / ((Factorial_of_r) * (Factorial_of_nr));
        return bincoffe;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of N:");
        int N = sc.nextInt();
        System.out.print("Enter The Value of R:");
        int R = sc.nextInt();

        int result = binaomial_Coffecient(N, R);
        System.out.println("The Binomial Cofficient of n and r is:" + result);

    }
}
