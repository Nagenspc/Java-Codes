import java.util.Scanner;

public class Multiple_Of_Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {
            System.err.print("Enter A Number:");
            int Number = sc.nextInt();
            // System.out.println(Number);
            if (Number % 10 == 0) {
                break;
            }
            System.out.println(Number);
        }
    }
}
