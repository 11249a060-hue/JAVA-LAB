AIM:-
To write a Java program using a user-defined package named Shape to calculate the perimeter and area of a circle, square, and triangle.

ALGORITHM:-
1. Create a package named Shape.
2. Create three classes: Circle, Square, and Triangle.
3. Define constructors to initialize the radius and sides.
4. Define methods to calculate the perimeter and area of each shape.
5. Import the Shape package into the Calculate class.
6. Read the radius of the circle, side of the square, and three sides of the triangle from the user.
7. Create objects for the three classes.
8. Calculate and display the perimeter and area of each shape.

PROGRAM:-
package Shape;

public class Circle {
    private int radius;

    public Circle(int r) {
        radius = r;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}
package Shape;

public class Square {
    private int side;

    public Square(int s) {
        side = s;
    }

    public int perimeter() {
        return 4 * side;
    }

    public int area() {
        return side * side;
    }
}
package Shape;

public class Triangle {
    private int side1, side2, side3;

    public Triangle(int s1, int s2, int s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public int perimeter() {
        return side1 + side2 + side3;
    }

    public double area() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) *
                         (s - side2) * (s - side3));
    }
}

import Shape.*;
import java.util.*;

class Calculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The side of the Square : ");
        int s = sc.nextInt();

        Square sq = new Square(s);

        System.out.println("Perimeter of Square is " + sq.perimeter());
        System.out.println("Area of Square is " + sq.area());

        System.out.println("Enter The radius of the Circle : ");
        int r = sc.nextInt();

        Circle ci = new Circle(r);

        System.out.println("Perimeter of Circle is " + ci.perimeter());
        System.out.println("Area of Circle is " + ci.area());

        System.out.println("Enter The Side1 of the Triangle : ");
        int s1 = sc.nextInt();

        System.out.println("Enter The Side2 of the Triangle : ");
        int s2 = sc.nextInt();

        System.out.println("Enter The Side3 of the Triangle : ");
        int s3 = sc.nextInt();

        Triangle t = new Triangle(s1, s2, s3);

        System.out.println("Perimeter of Triangle is " + t.perimeter());
        System.out.println("Area of Triangle is " + t.area());

        sc.close();
    }
}

OUTPUT:-
Enter The radius of the Circle:
5
Perimeter of Circle is 31.400000000000002
Area of Circle is 78.5
Enter The Side1 of the Triangle:
3
Enter The Side2 of the Triangle:
4
Enter The Side3 of the Triangle:
5
Perimeter of Triangle is 12
Area of Triangle is 6.0

RESULT:-
Thus, the Java program using the user-defined Shape package was executed successfully
    to calculate the perimeter and area of a circle, square, and triangle.
