public class RecursionBasics {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        ;
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 10) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printInc(n + 1);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        // printDec(a);
        printInc(b);
    }
}
