import java.util.Scanner;

public class Except_Multiple_Of_ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {
            System.out.print("Enter A Number:");
            int Number = sc.nextInt();
            if (Number % 10 == 0) {
                continue;
            }
            System.out.println("Number Is:" + Number);
        }
    }
}
