public class Copy_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nagen";
        s1.roll = 047;
        s1.password = "nagne!123";

        Student s2 = new Student(s1);
        s2.password = "puja@123";
        System.out.println(s2.password);

    }
}

class Student {
    String name;
    int roll;
    String password;

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student() {
        System.out.println("DEfault Constructor is Called!!");
    }

}
