package learn.abstractclass;

public class Farmer {

    String name;
    String profession = "Farmer";

    Farmer(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println("I am sleeping with my eyes closed");
    }

    void eat() {
        System.out.println("I am eating with my mouth");
    }

    void working() {
        System.out.println("I am working at the field");
    }

}
