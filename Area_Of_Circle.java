import java.util.Scanner;

public class Area_Of_Circle {

    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Radius Of The Circle:");
        float Radius = sc.nextFloat();

        double Area = pi * Radius * Radius;
        System.out.println("The Area Of The circle Is :" + Area);
    }
}
