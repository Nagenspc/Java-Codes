import java.util.Scanner;

public class Even_Odd_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Many Integers You Want To Read:");
        int Count = sc.nextInt();

        int Even_Sum = 0, Odd_Sum = 0;

        for (int i = 1; i <= Count; i++) {
            System.out.print("Enter The Number " + i + ":");
            int Numbers = sc.nextInt();

            if (Numbers % 2 == 0) {
                Even_Sum = Even_Sum + Numbers;
            } else {
                Odd_Sum = Odd_Sum + Numbers;
            }
        }

        System.out.println("The Sum Of The Even Numbers Is:" + Even_Sum);
        System.out.println("The Sum Of The Odd Numbers Is:" + Odd_Sum);

    }
}
