import java.util.*;

public class Palindrome_Checker {
    public static int find_Reverse_Num(int Num) {
        int last_Digit;
        int rev_Num = 0;

        while (Num > 0) {
            last_Digit = Num % 10;
            rev_Num = last_Digit + (rev_Num * 10);
            Num = Num / 10;
        }
        return rev_Num;
    }

    public static void check_Palindrome(int Num_for_check) {
        if (find_Reverse_Num(Num_for_check) == Num_for_check) {
            System.out.println("The Entered Number:" + Num_for_check + " Is A Palindrome Number!!");
        } else {
            System.out.println("The Entered Number:" + Num_for_check + " Is Not A Palindrome Number!!");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Number For Checking Palindrome:");
        int Number = sc.nextInt();

        check_Palindrome(Number);
    }
}
