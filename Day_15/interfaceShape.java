package Day_15;

import java.util.*;

interface Shape {
    void get_data(Scanner sc);
    void display_area();
}

class Rectangle implements Shape {
    int length, breadth;

    public void get_data(Scanner sc) {
        System.out.println("Enter length and breadth:");
        length = sc.nextInt();
        breadth = sc.nextInt();
    }

    public void display_area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Square implements Shape {
    int side;

    public void get_data(Scanner sc) {
        System.out.println("Enter side:");
        side = sc.nextInt();
    }

    public void display_area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

public class interfaceShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape r1 = new Rectangle();
        Shape s1 = new Square();

        r1.get_data(sc);
        r1.display_area();

        s1.get_data(sc);
        s1.display_area();

        sc.close();
    }
}
