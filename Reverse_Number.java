import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number For Reversing :");
        int Number = sc.nextInt();
        int Reminder;

        for (int i = 1; Number > 0; i++) {
            Reminder = Number % 10;
            System.out.print(Reminder);
            Number = Number / 10;
        }
        System.out.println();
    }
}
