import java.util.Scanner;

public class Sum_Of_Digits_Num {
    public static int calculate_Sum_Of_Digits(int Number) {
        int sum = 0;
        int last_Digit;

        while (Number > 0) {
            last_Digit = Number % 10;
            sum = sum + last_Digit;
            Number = Number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer For Calculating The Sum:");
        int Num = sc.nextInt();

        int result = calculate_Sum_Of_Digits(Num);
        System.out.println("The Sum Of The Digits Of The Entered Number:" + Num + " Is:" + result);
    }
}
