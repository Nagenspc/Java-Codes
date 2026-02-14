//Count The Number OF 7s I Matrix
public class Arr2d_1 {
    public static int count7s(int arr[][]) {
        int Count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    Count += 1;
                }
            }
        }
        return Count;
        // System.out.println("The '7' Appear: " + Count + "Times!!");
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 7, 7, 8 }, { 8, 8, 7 }, { 7, 7, 7 }
        };
        int Result = count7s(arr);
        System.out.println("The '7' Appear: " + Result + " Times!!");

    }
}
