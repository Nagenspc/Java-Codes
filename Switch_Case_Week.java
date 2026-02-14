import java.util.Scanner;

public class Switch_Case_Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Day Number:");
        int Week_Num = sc.nextInt();

        switch (Week_Num) {
            case 1:
                System.out.println("Today Is Monday");
                break;
            case 2:
                System.out.println("Today Is Tuesday");
                break;
            case 3:
                System.out.println("Today Is Wednesday");
                break;
            case 4:
                System.out.println("Today Is Thursday");
                break;
            case 5:
                System.out.println("Today Is Friday");
                break;
            case 6:
                System.out.println("Today Is Saturday");
                break;
            case 7:
                System.out.println("Today Is Sunday");
                break;

            default:
                System.out.println("Invalid Choice!");
                break;
        }
    }
}
