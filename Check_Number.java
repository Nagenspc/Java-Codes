import java.util.Scanner;

public class Check_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number For Checking:");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("The Entered Number" + num + " Is Equal To Zero(0)");
        } else if (num > 0) {
            System.out.println("The Entered Number" + num + " Is Positive");

        } else {
            System.out.println("The Entered Number" + num + " Is Negative");
        }

    }
}
