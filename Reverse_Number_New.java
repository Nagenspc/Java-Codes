import java.util.Scanner;

public class Reverse_Number_New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Reverse:");
        int Number = sc.nextInt();
        int Prev_Number = Number;

        int Last_Digit, Rev_Num = 0;
        while (Number > 0) {
            Last_Digit = Number % 10;
            Rev_Num = (Rev_Num * 10) + Last_Digit;
            Number = Number / 10;
        }
        System.out.println("The Reversed Number Of the Given Number " + Prev_Number + " Is:" + Rev_Num);
    }
}
