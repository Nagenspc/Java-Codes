public class Sub_Arrays {
    public static void printSubArrays(int arr[]) {
        int total_Sub_Array = 0;
        // int max_Sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int Start = i;
            for (int j = i; j < arr.length; j++) {
                int End = j;
                for (int k = Start; k <= End; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                total_Sub_Array++;
            }
            System.out.println();
        }

        System.out.println("Total SubArray Is:" + total_Sub_Array);
    }

    public static void main(String[] args) {
        int Numbers[] = { 2, 4, 6, 8, 10, 15 };
        // System.out.println(Numbers[0] + Numbers[Numbers.length - 1]);
        printSubArrays(Numbers);
    }
}
