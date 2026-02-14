import java.util.Scanner;

public class Matrix_Arr3 {
    public static void diagonal_Sum(int arr[][]) {
        int Sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (i == j) {
        // Sum = Sum + arr[i][j];
        // } else if (i + j == arr.length - 1) {
        // Sum = Sum + arr[i][j];
        // }
        // }
        // }
        for (int i = 0; i < arr.length; i++) {
            // Primary Diagonal
            Sum = Sum + arr[i][i];
            // Secondary Diagonal;
            if (i != arr.length - 1 - i) {
                Sum = Sum + arr[i][arr.length - i - 1];
            }
        }
        System.out.println("The Sum Of Primary Digonal Is: " + Sum);
    }

    public static void main(String[] args) {

        System.out.print("Enter The Size Of The Square Mtarix:");
        Scanner sc = new Scanner(System.in);
        int Square_Mat_Size = sc.nextInt();
        int Matrix[][] = new int[Square_Mat_Size][Square_Mat_Size];
        System.err.println("Enter a Matrix Of Size: " + Square_Mat_Size);
        for (int i = 0; i < Square_Mat_Size; i++) {
            for (int j = 0; j < Square_Mat_Size; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix Of Size " + Square_Mat_Size + " Is:");
        for (int i = 0; i < Square_Mat_Size; i++) {
            for (int j = 0; j < Square_Mat_Size; j++) {
                System.err.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        diagonal_Sum(Matrix);
    }
}
