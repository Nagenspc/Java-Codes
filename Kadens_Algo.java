public class Kadens_Algo {
    public static void print_MaxSum_Kadens(int arr[]) {
        int curr_Sum = 0;
        int max_Sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + curr_Sum < 0) {
                curr_Sum = 0;

            } else {
                curr_Sum = curr_Sum + arr[i];

            }
            if (curr_Sum > max_Sum) {
                max_Sum = curr_Sum;
            }

            // max_Sum = curr_Sum;
        }

        System.out.print("The Maximum Subarray Sum Is:" + max_Sum);
    }

    public static void main(String[] args) {
        int Numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int Numbers1[] = { 2, 4, 6, 8, 10 };
        print_MaxSum_Kadens(Numbers);
        System.err.println();
        print_MaxSum_Kadens(Numbers1);
    }
}
