import java.util.Scanner;

public class Prime_Number_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number for Checking Prime Number:");
        int Number = sc.nextInt();

        int i, Flag = 0;
        for (i = 2; i < Number; i++) {
            if (Number % i == 0) {
                Flag = 1;
                break;
            }
        }
        if (Flag == 0) {
            System.out.println("The Entered Number " + Number + " Is A Prime Number");
        } else {
            System.out.println("The Entered Number " + Number + " Is Not A Prime Number");
        }
    }
}
