import java.util.*;

public class Check_PIme_Functn {
    public static int check_Prime(int Number) {
        // Corner Case

        int flag = 0;
        for (int i = 2; i < Number; i++) {
            if (Number % i == 0) {
                flag = 1;
                break;
            }
        }
        return flag;

    }

    public static void prime_In_Range(int Range) {
        for (int i = 2; i <= Range; i++) {
            if (check_Prime(i) == 0)

                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number For Checking Prime Number:");
        int Num = sc.nextInt();
        System.out.print("Enter The Range You Want To Print The Prime Numbers:");
        int Range = sc.nextInt();
        if (Num == 2) {
            System.out.println("The Entered Number " + Num + " Is Prime Number!!");
            return;
        }
        int Result = check_Prime(Num);

        if (Result == 1) {
            System.out.println("The Entered Number " + Num + " Is Not a prime Number!!");
        } else {
            System.out.println("The Entered Number " + Num + " Is a prime Number!!");
        }
        System.out.println("The Prime Numbers Between 1 To " + Range + " Are:");
        prime_In_Range(Range);

    }
}
