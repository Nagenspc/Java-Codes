public class Constructor1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Nagen");
        Student s3 = new Student(47);
        Student s4 = new Student("Nihar", 49);
        System.out.println(s4.roll + " " + s4.name);
        System.out.println(s3.name);

    }
}

class Student {
    String name;
    int roll;

    Student() { // Default Constructor
        System.out.println("COnstructor Is Called!!");
    }

    Student(String name) { // Parameterized Constuctor
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

    Student(String name, int roll) { // Parameterize Constructor
        this.name = name;
        this.roll = roll;
    }

}
