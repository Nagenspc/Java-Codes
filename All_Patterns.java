import java.util.*;

public class All_Patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Lines You Want to Print:");
        int n = sc.nextInt();
        char ch = 'A';
        int ch1 = 1;
        // Print The Star Pattern
        for (int lines = 1; lines <= n; lines++) {
            for (int stars = 1; stars <= lines; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Print The Inverted Star Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Print Half-Pyramid Patten
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println();
        }
        // Print Character PyrRamid Pattern
        for (int p = 1; p <= n; p++) {
            for (int chars = 1; chars <= p; chars++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
        for (int p = 1; p <= n; p++) {
            for (int chars = 1; chars <= p; chars++) {
                System.out.print(ch1 + " ");
                ch1++;

            }
            System.out.println();
        }
    }
}
