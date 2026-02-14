import java.util.Arrays;

public class Rotate_Array_Left {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 3;
        // rotate_D_placeLeft(arr, k);
        rotate_D_placeRight(arr, k);

    }

    public static void rotate_D_placeLeft(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        reverse_Arr(arr, 0, d - 1);
        reverse_Arr(arr, d, n - 1);
        reverse_Arr(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate_D_placeRight(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        reverse_Arr(arr, n - d, n - 1);
        reverse_Arr(arr, 0, n - d - 1);
        reverse_Arr(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse_Arr(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
}
