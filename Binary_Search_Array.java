public class Binary_Search_Array {
    public static int binary_Search(int arr[], int key) {
        //int Index = 0;
        int Start = 0;
        int End = arr.length - 1;
        while (Start <= End) {
            int Mid = (Start + End) / 2;
            if (arr[Mid] == key) {
                return Mid;
            } else if (arr[Mid] > key) {
                End = Mid - 1;
            } else {
                Start = Mid + 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int Numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int Key = 12;
        int key_At_Index = binary_Search(Numbers, Key);
        if (key_At_Index == -1)
        {
            System.out.println("The Entered Key Is Not Present In The Given List:");
        }
        else {
            System.out.println("The Entered Key:" + Key + " Is Present At Index: "+ key_At_Index);
        }
        //System.out.println(key_At_Index);
    }
}
