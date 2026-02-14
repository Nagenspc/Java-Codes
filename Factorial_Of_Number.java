import java.util.Scanner;

public class Factorial_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number For Calculating Factorial:");
        int Number = sc.nextInt();

        int Fact = 1;

        for (int i = 1; i <= Number; i++) {
            Fact = Fact * i;
        }
        System.out.println("The Factorial Of The Enetred Number " + Number + " Is:" + Fact);
    }
}
