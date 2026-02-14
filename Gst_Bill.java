import java.util.Scanner;

public class Gst_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Cost Of Pencil:");
        float Pencil = sc.nextFloat();
        System.out.print("Enter The Cost Of Pen:");
        float Pen = sc.nextFloat();
        System.out.print("Enter The Cost Of Eraser:");
        float Eraser = sc.nextFloat();

        float Total_cost = Pencil + Pen + Eraser;

        float Total_Cost_With_Gst = Total_cost + (0.18f * Total_cost);

        System.out.println("The Total Cost Of All Items Is:" + Total_cost);
        System.out.println("The Total Cost With Gst Bill(18%) Of All Items Is:" + Total_Cost_With_Gst);

    }
}
