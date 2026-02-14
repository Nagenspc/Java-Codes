public class Maxm_Product {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 2, 4 };
        // System.out.println(max_ProductArr(arr));
        System.out.println(optimized_Max(arr));

    }

    public static int max_ProductArr(int arr[]) {
        int product;
        int max_Product = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                product = 1;
                for (int k = i; k < j; k++) {
                    product = product * arr[k];
                }
                if (product > max_Product) {
                    max_Product = product;

                }

            }
        }
        return max_Product;

    }

    public static int optimized_Max(int arr[]) {
        int left_pref = 1;
        int right_suff = 1;
        int max_Prod = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (left_pref == 0)
                left_pref = 1;
            if (right_suff == 0)
                right_suff = 1;
            left_pref = left_pref * arr[i];
            right_suff = right_suff * arr[n - i - 1];
            max_Prod = Math.max(max_Prod, Math.max(left_pref, right_suff));
        }
        return max_Prod;
    }
}
