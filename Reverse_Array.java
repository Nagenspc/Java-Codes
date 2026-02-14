public class Reverse_Array {
    public static void reverse(int arr[]) {
        int Start = 0;
        int End = arr.length - 1;
        while (Start < End) {
            int Temp = arr[End];
            arr[End] = arr[Start];
            arr[Start] = Temp;

            Start++;
            End--;
        }

    }

    public static void main(String[] args) {
        int Numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        reverse(Numbers);
        for (int i = 0; i < Numbers.length; i++) {
            System.out.print(Numbers[i] + " ");
        }
        System.out.println();

    }
}
