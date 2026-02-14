public class Inheritance1 {
    public static void main(String[] args) {
        Fish Rohi = new Fish();
        Rohi.color = "Blue";
        Rohi.eat();

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats....");
    }

    void breathe() {
        System.out.println("Breathes...");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("SWims in Water...");
    }
}
