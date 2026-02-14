public class Multiple_Inheritance {
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.eatMeat();
        b1.eatPlants();
    }
}

interface Herbivores {
    void eatPlants();
}

interface Carnivores {
    void eatMeat();
}

class Bear implements Herbivores, Carnivores {
    public void eatPlants() {
        System.out.println("Bear Eat Plants....");
    }

    public void eatMeat() {
        System.out.println("Bear Eats Meat.....");
    }
}

