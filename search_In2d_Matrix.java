public class search_In2d_Matrix {
    public static boolean staircase_Search(int arr[][], int Key) {
        int row = arr.length - 1;
        int col = 0;
        while (row >= 0 && col < arr[0].length - 1) {
            if (arr[row][col] == Key) {
                System.out.println("Key Element Is Found At (" + row + "," + col + ")");
                return true;
            } else if (Key < arr[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("Key Not Found!!");
        return false;
    }

    public static void main(String[] args) {
        int Matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int Key = 33;
        staircase_Search(Matrix, Key);
    }
}
