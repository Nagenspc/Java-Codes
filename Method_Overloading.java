public class Method_Overloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(23, 44));
        System.out.println(c1.sum(2.5f, 4.5f));
        System.out.println(c1.sum(12, 23, 23));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}
