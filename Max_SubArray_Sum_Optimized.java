public class Max_SubArray_Sum_Optimized {
    public static void maxSubArray_Sum_Optimized(int arr[]) {
        int max_Sum = arr[0];
        int curr_Sum = 0;
        int prefix_arr[] = new int[arr.length];
        prefix_arr[0] = arr[0];
        for (int i = 1; i < prefix_arr.length; i++) {
            prefix_arr[i] = prefix_arr[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int Start = i;
            for (int j = 0; j < arr.length; j++) {
                int End = j;

                curr_Sum = Start == 0 ? prefix_arr[End] : prefix_arr[End] - prefix_arr[Start - 1];

                if (curr_Sum > max_Sum) {
                    max_Sum = curr_Sum;

                }
            }

        }
        System.out.println("The MAximum SubArray Sum Is:" + max_Sum);

    }

    public static void main(String[] args) {
        int Numbers[] = { 2, 4, 6, 8, 10, 12 };
        maxSubArray_Sum_Optimized(Numbers);
    }
}
