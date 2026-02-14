public class Linear_Search {
    public static int linear_Search(int arr[], int Key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int Numbers[] = { 12, 34, 11, 45, 56, 72, 92, 10, 15, 20 };
        int Key = 100;
        int key_At_index = linear_Search(Numbers, Key);
        if (key_At_index == -1) {
            System.out.println("The Entered Key Element Is Not Present In The Numbers Array!");
            
        }
        else
        {
            System.out.println("The Key:" + Key + " Is Present At index = " + key_At_index);
        }
        
    }
}
