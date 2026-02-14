import java.util.Scanner;

public class Calculate_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Three Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        float avg = (float) sum / 3;

        System.out.println("The Average Of three Nmbers is :" + avg);

    }
}
