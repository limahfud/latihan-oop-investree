package learn.abstractclass;

import java.util.Scanner;

public class AbstractApplication {

    private static Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("==== Hey Choose the Character Below =====");
        System.out.println("1. A Farmer");
        System.out.println("2. A Fisherman");
        System.out.println("3. A Breeder");
        System.out.print("Your Choose : ");
        int selected = scanner.nextInt();

        System.out.print("That's cool choice. Now give him a name: ");
        String name = scanner.next();

        System.out.println("\nOutput : ");
        if (selected == 1) {
            Farmer farmer = new Farmer(name);
            System.out.println("Hey, my name is " + farmer.name + ", and I am a " + farmer.profession);
            farmer.eat();
            farmer.sleep();
            farmer.working();
        } else if (selected == 2) {
            Fisherman fisherman = new Fisherman(name);
            System.out.println("Hey, my name is " + fisherman.name + ", and I am a " + fisherman.profession);
            fisherman.eat();
            fisherman.sleep();
            fisherman.working();
        } else {
            Breeder breeder = new Breeder(name);
            System.out.println("Hey, my name is " + breeder.name + ", and I am a " + breeder.profession);
            breeder.eat();
            breeder.sleep();
            breeder.working();
        }
    }

    // TODO 1. use encapsulation to wrap all data in model
    // TODO 2. create abstract class to minimize the code duplication

}
