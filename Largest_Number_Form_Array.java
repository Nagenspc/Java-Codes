public class Largest_Number_Form_Array {
    public static void largest_Num_From_Arr(int arr[]) {
        int Max = arr[0];
        int Min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        System.out.println("The Largest Number From The Given Array Is: " + Max);
        System.out.println("The Smallest Number From The Given Array Is: " + Min);
        // return Max;
    }

    public static void main(String[] args) {
        int Numbers[] = { 12, 23, 4, 3, 54, 11, 9, 6, 30 };
        largest_Num_From_Arr(Numbers);

    }
}
