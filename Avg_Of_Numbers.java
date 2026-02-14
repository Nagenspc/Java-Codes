import java.util.Scanner;

public class Avg_Of_Numbers {
    public static float calculate_Avg(int Num1, int Num2, int Num3) {
        float avg;
        avg = (Num1 + Num2 + Num3) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg_Result = calculate_Avg(a, b, c);
        System.out.println("The Average Of The Three Numbers Is :" + avg_Result);
    }
}
