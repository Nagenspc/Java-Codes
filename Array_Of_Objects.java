public class Array_Of_Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Nagen";
        s1.mark = 78;
        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Nagun";
        s2.mark = 75;
        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Hanu";
        s3.mark = 89;

        Student stud[] = new Student[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i].name + ":" + stud[i].roll);
        }

    }
}

class Student {
    int roll;
    String name;
    int mark;
}
