import java.util.Scanner;

public class Area_Of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Side of The Square:");
        float Side = sc.nextFloat();

        float Area = Side * Side;

        System.out.print("The Area of The Square is:" + Area);

    }
}
