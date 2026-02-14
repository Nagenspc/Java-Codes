public class Check_Even_Using_Function {
    public static boolean isEven(int Number) {
        if (Number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int Num = 12;
        boolean result = isEven(Num);
        System.err.println(result);
    }
}
