import java.util.Arrays;

public class Product_Array {
    public static void product_Arr(int arr[]) {
        int arr_size = arr.length;
        int left_arr[] = new int[arr_size];
        int right_arr[] = new int[arr_size];
        int result_arr[] = new int[arr_size];
        int product1 = 1;
        // Product OF Left Elements In The Array
        for (int i = 0; i < arr_size; i++) {
            left_arr[i] = product1;
            product1 *= arr[i];
        }
        int product2 = 1;
        // Product OF Right Elemnts In the Array
        for (int i = arr_size - 1; i >= 0; i--) {
            right_arr[i] = product2;
            product2 *= arr[i];
        }
        for (int i = 0; i < arr_size; i++) {
            result_arr[i] = left_arr[i] * right_arr[i];
        }
        System.out.print(Arrays.toString(result_arr));
        // System.out.print(Arrays.toString(left_arr));
        // System.out.print(Arrays.toString(right_arr));

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        product_Arr(arr);
    }
}
