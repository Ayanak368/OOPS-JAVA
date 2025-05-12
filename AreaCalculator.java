public class AreaCalculator {

    // Area of circle
    void area(double radius) {
        double result = 3.1416 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    // Area of rectangle
    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }

    // Area of square
    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square: " + result);
    }

    // Area of triangle
    void area(double base, double height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();

        ac.area(5.0); // Circle
        ac.area(4, 6); // Rectangle
        ac.area(5); // Square
        ac.area(6.0, 8.0); // Triangle
    }
}
