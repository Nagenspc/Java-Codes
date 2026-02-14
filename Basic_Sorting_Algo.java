public class Basic_Sorting_Algo {

    public static void bubble_Sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
    }

    public static void selection_Sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_Pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_Pos] < arr[j]) {
                    min_Pos = j;

                }

            }
            int temp = arr[min_Pos];
            arr[min_Pos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion_Sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = temp;

        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int Numbers[] = { 5, 4, 1, 2, 3 };
        insertion_Sort(Numbers);
        printArr(Numbers);
    }
}
