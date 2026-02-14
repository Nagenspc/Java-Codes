
// Finding The Largest And Smallest Element For A 2D Array
import java.util.Scanner;

public class Matrix_Arr2 {
    public static void printUpper_Tringular_Matrix(int arr[][]) {
        System.out.println("THe Upper Triangular MAtrix Is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i > j) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }
    }

    public static void printLower_Tringular_Matrix(int arr[][]) {
        System.out.println("THe Lower Triangular MAtrix Is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j > i) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }
    }

    public static void find_Large_Small(int arr[][]) {
        int largest_Element = arr[0][0];
        int smallest_Element = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > largest_Element) {
                    largest_Element = arr[i][j];
                }
                if (arr[i][j] < smallest_Element) {
                    smallest_Element = arr[i][j];
                }
            }
        }
        System.err.println("The Largest Element From the 2D Array Is : " + largest_Element);
        System.err.println("The Smallest Element From The 2D Array Is: " + smallest_Element);
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("Enter The 2D Array Elements:");
        // Input 2D Array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Print 2D Array
        System.out.println("2D Array Elements Are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        find_Large_Small(arr);
        // printUpper_Tringular_Matrix(arr);
        printLower_Tringular_Matrix(arr);
    }
}
