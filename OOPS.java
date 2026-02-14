
public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Red");
        // System.out.println(p1.color);
        // p1.color = "Yellow";
        // System.out.println(p1.color);
        // p1.setPrice(12.5f);
        // System.out.println(p1.price);
        // p1.tip = 14;
        // System.out.println(p1.tip);
        // p1.setTip(20);
        // System.out.println(p1.tip);
        // OOPS obj = new OOPS();
        // System.out.println(obj);
        // Student s1 = new Student();
        // s1.calPercentage(89f, 76.5f, 98f);
        // System.out.println(s1.percentage);
        BankAccount myAcc = new BankAccount();
        myAcc.username = "NagenNayak";
        System.out.println(myAcc.username);
        System.out.println(myAcc.setPassword("@bcs321h"));

    }
}

class Pen {
    // Properties Of Pen
    String color;
    int tip;
    float price;

    // Methods Of Pen
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    void setPrice(float newPrice) {
        price = newPrice;
    }

}

class Student {
    // Properties Of Student
    String name;
    int age;
    int rollNo;
    float percentage;

    // Methods Of Student Class
    void calPercentage(float phy, float chem, float math) {
        percentage = (phy + chem + math) / 3;
    }
}

class BankAccount {
    public String username;
    private String password;

    public String setPassword(String newPwd) {
        password = newPwd;
        // System.out.println(password);
        return password;
    }

}
