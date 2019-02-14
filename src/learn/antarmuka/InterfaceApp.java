package learn.antarmuka;

public class InterfaceApp {

    public void start() {
        displayComputedArea(new Circle(10));


        displayComputedArea(new Rectangle(10, 20));


        displayComputedArea(new Triangle(10, 20));
    }

    private static void displayComputedArea(Rectangle rectangle) {
        System.out.println("The area of this shape is : " + rectangle.getArea());
    }

    private static void displayComputedArea(Circle circle) {
        System.out.println("The area of this shape is : " + circle.getArea());
    }

    private static void displayComputedArea(Triangle triangle) {
        System.out.println("The area of this shape is : " + triangle.getArea());
    }

    // Complete the task.

    // TODO 1. Create new Class called Trapezium, which has this following properties : lowerBar, upperBar, height

    // TODO 2. Put Trapezium to be parameter of displayComputeArea method (without interface)

    // TODO 3. Create an interface to simplify the process

    // TODO 4. Add method get the perimeter of all those objects

    // TODO 5. Create function that able to count perimeter of each 2 dimentional shapes
}
