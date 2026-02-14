import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];
        System.out.println("Enter the Marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("The Entered Marks Are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        int Sum = 0;
        float Avg;
        for (int i = 0; i < marks.length; i++) {
            Sum = Sum + marks[i];
        }
        Avg = Sum / marks.length;
        System.out.println("The Average Of The Array Elements Is:" + Avg);

    }
}
