import java.util.Scanner;

public class Decimal_To_Binary_Convrsn {
    public static void dec_To_Bin(int decNum) {
        int Original_Num = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {

            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow += 1;
            decNum = decNum / 2;
        }
        System.out.println("The Decimal Number:" + Original_Num + " Is Equivalent To The Binary Number:" + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Decimal Number:");
        int Decimal_Num = sc.nextInt();

        dec_To_Bin(Decimal_Num);
    }
}
