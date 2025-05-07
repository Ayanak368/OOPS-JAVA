import graphics.RectanglE;
import graphics.Triangle;
import graphics.Square;
import graphics.Circle;
import graphics.ShapE;

public class TestGraphics {
    public static void main(String[] args) {
        ShapE rectangle = new RectanglE(5.0, 4.0);
        ShapE triangle = new Triangle(6.0, 3.0);
        ShapE square = new Square(4.0);
        ShapE circle = new Circle(7.0);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}

