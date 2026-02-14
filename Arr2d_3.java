public class Arr2d_3 {
    public static void main(String[] args) {
        int Row = 3, Column = 3;
        int Matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int Trans_Matrix[][] = new int[Column][Row];
        printMatrix(Matrix);
        // Transpose The Matrix
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                Trans_Matrix[j][i] = Matrix[i][j];
            }
        }
        printMatrix(Trans_Matrix);
    }

    public static void printMatrix(int arr[][]) {
        System.out.println("The Matrix Is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
