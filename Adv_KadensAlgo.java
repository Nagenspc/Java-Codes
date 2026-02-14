public class Adv_KadensAlgo {
    public static int check_All_Negative(int arr[]) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count += 1;
            }
        }
        if (count == arr.length) {
            result = 1;
        }
        return result;
    }

    public static void max_Negative_Element(int arr[]) {
        int max_Element = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_Element) {
                max_Element = arr[i];
            }
        }
        System.out.println("The Max SubArray Sum Is :" + max_Element);
    }

    public static void adv_KadensAlgorithim(int arr[]) {
        int curr_Sum = 0;
        int max_Sum = arr[0];
        int negative_Check = check_All_Negative(arr);
        if (negative_Check == 1) {
            System.out.println("All The Array Elements Are Negative!!");
            max_Negative_Element(arr);
        } else {

            for (int i = 0; i < arr.length; i++) {
                if (curr_Sum + arr[i] < 0) {
                    curr_Sum = 0;
                } else {
                    curr_Sum = curr_Sum + arr[i];
                }
                if (curr_Sum > max_Sum) {
                    max_Sum = curr_Sum;
                }
            }
            System.out.println("The Maximum Subarray Sum Of The Given Array is:" + max_Sum);
        }

    }

    public static void main(String[] args) {
        int Numbers[] = { 12, -2, -4, -6, -7, -20 };
        int Numbers1[] = { 2, 4, 6, 8, 10 };
        // int Result = check_All_Negative(Numbers);
        // System.out.println(Result);
        // max_Negative_Element(Numbers);
        adv_KadensAlgorithim(Numbers1);
    }
}
