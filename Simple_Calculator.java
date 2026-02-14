import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two Numbers For Operation:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("Enter The Operator For Operation:");
        String op = sc.next();

        int Result;

        switch (op) {
            case "+":
                Result = num1 + num2;
                System.out.println("Addition Of " + num1 + " And " + num2 + " Is:" + Result);
                break;
            case "-":
                Result = num1 - num2;
                System.out.println("Substraction Of " + num1 + " And " + num2 + " Is:" + Result);
                break;
            case "*":
                Result = num1 * num2;
                System.out.println("Multiplication Of " + num1 + " And " + num2 + "Is:" + Result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Divisible By Zero Is Not Allowed!");
                    break;
                }
                Result = num1 / num2;
                System.out.println("Division Of " + num1 + " And " + num2 + " Is:" + Result);
                break;
            case "%":
                Result = num1 % num2;
                System.out.println("Modulo(Reminder) Of " + num1 + "And" + num2 + " Is:" + Result);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

}
