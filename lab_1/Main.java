import java.util.Scanner;

interface Prototypes {
    void area();
    void perimeter();
}

class Circle implements Prototypes {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of circle is " + 3.14 * radius * radius);
    }

    public void perimeter() {
        System.out.println("Perimeter of the circle is " + 2 * 3.14 * radius);
    }
}

class Rectangle implements Prototypes {
    double len, bre;

    Rectangle(double len, double bre) {
        this.len = len;
        this.bre = bre;
    }

    public void area() {
        System.out.println("Area of rectangle is " + len * bre);
    }

    public void perimeter() {
        System.out.println("Perimeter of rectangle is " + 2 * (len + bre));
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the radius:");
                    double r1 = sc.nextDouble();
                    Circle c = new Circle(r1);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                    System.out.println("Enter the length of the rectangle:");
                    double len = sc.nextDouble();
                    System.out.println("Enter the breadth of the rectangle:");
                    double bre = sc.nextDouble();
                    Rectangle r = new Rectangle(len, bre);
                    r.area();
                    r.perimeter();
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 3);
    }
}
