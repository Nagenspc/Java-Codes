public class Max_Subarray_Sum {
    public static void print_MaxSubarray_Sum(int arr[]) {
        int max_Sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int Start = i;
            for (int j = i; j < arr.length; j++) {
                int End = j;
                int current_Sum = 0;
                for (int k = Start; k <= End; k++) {
                    current_Sum = current_Sum + arr[k];
                }

                System.out.println(current_Sum);

                if (current_Sum > max_Sum) {
                    max_Sum = current_Sum;

                }

            }
            System.out.println();
        }
        System.out.println("The Maximum Subarray Sum Is:" + max_Sum);
    }

    public static void main(String[] args) {
        int Numbers[] = { 2, 4, 6, 8, 10, 12 };
        print_MaxSubarray_Sum(Numbers);
    }
}
