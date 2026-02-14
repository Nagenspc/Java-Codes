import java.util.*;

public class Sum_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of a:");
        int a = sc.nextInt();
        System.out.print("Enter The Value Of b:");
        int b = sc.nextInt();

        int sum = a + b;
        int product = a * b;

        System.out.println("The Sum Of The Two Number a And b is :" + sum);
        System.out.println("The Product Of The Two Number a And b is :" + product);
    }
}
