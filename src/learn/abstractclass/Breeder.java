package learn.abstractclass;

public class Breeder {
    String name;
    String profession = "Breeder";

    Breeder(String name) {
        this.name = name;
    }

    void working() {
        System.out.println("I am working with sheep, cows, and horses.");
    }

    void sleep() {
        System.out.println("I am sleeping with my eyes closed");
    }

    void eat() {
        System.out.println("I am eating with my mouth");
    }
}
