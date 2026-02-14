import java.util.Scanner;

public class Bin_To_Decimal_Convrsn {
    public static void bin_To_Decimal(int binNum) {
        int Original_bin_num = binNum;
        int pow = 0;
        int dec_Num = 0;
        int last_Digit = 1;

        while (binNum > 0) {
            last_Digit = binNum % 10;
            dec_Num = dec_Num + (last_Digit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("The Binary Number:" + Original_bin_num + " Equvalent To The Decimal Number is:" + dec_Num);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Binary Number Consists Of (0,1):");
        int binary_Number = sc.nextInt();

        bin_To_Decimal(binary_Number);
    }
}
