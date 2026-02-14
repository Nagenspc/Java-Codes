import java.util.Scanner;

public class Sum_Of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("From 1 :Enter The Range You Want To Calculate The Sum:");
        int Range = sc.nextInt();
        int Counter = 0, Sum = 0;

        while (Counter <= Range) {
            Sum = Sum + Counter;
            Counter += 1;
        }
        System.out.println("The Sum Of 1 To " + Range + " Is: " + Sum);

    }
}
