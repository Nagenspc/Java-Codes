import java.util.*;

public class Matrix_Arr {
    public static boolean search_Key(int Matrix[][], int Key) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                if (Matrix[i][j] == Key) {
                    System.out.println("The Element Is Found At Cell(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element Not Found !!");
        return false;

    }

    public static void main(String[] args) {
        System.out.println("Enter A 2D Array Of Integers:");
        int matrix[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length;
        int m = matrix[0].length;
        // Input 2D Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix Is :");
        // Output 2D Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter The Key Elemnet You want To Search:");
        int Key = sc.nextInt();
        search_Key(matrix, Key);
    }

}
