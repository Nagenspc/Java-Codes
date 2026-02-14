public class Arr2d_2 {
    public static void main(String[] args) {
        int arr[][] = { { 1, 4, 9, 4 }, { 10, 11, 4, 3 }, { 4, 2, 2, 3 } };
        int Sum = 0;
        // Sum of 2nd Row
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 1) {
                    Sum = Sum + arr[i][j];
                }

            }
        }
        System.out.println(Sum);
    }
}
