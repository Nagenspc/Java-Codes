public class Array_Value_Check {
    public static boolean check_Twice_Num(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int Numbers1[] = { 1, 2, 1, 4, 5, 6 };
        int Numbers2[] = { 3, 45,3, 56, 12, 47 };

        System.out.println(check_Twice_Num(Numbers1));
        System.out.println(check_Twice_Num(Numbers2));

    }
}
