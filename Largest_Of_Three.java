import java.util.Scanner;

public class Largest_Of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three Numbers:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= 3) {
            System.out.println(num1 + " Is Largest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " Is Largest");
        } else {
            System.out.println(num3 + " Is Largest");
        }

    }
}
