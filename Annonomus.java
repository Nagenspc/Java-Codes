public class Annonomus {
    public static void main(String[] args) {
        new A().show();
        new A().show();
        System.out.println();

    }
}

class A {
    public A() {
        System.out.println("Object Created");
    }

    public void show() {
        System.out.println("In show");
    }
}