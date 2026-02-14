public class String_Palindrome {
    public static boolean check_Palindrome(String str) {
        int str_Length = str.length();
        for (int i = 0; i < str_Length; i++) {
            if (str.charAt(i) != str.charAt(str_Length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(check_Palindrome(str));
    }
}
