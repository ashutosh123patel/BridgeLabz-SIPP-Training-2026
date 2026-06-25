abstract class Shape {
    String color;

    abstract double area();
    abstract double perimeter();

    @Override
    public abstract String toString();

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
class Circle extends Shape {

    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2*(Math.PI) *(radius);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + " and area is : " + area()+ " and  is perimeter: " + perimeter();
    }

    
}

class Rectangle extends Shape {

    double length;
    double breadth;

    public Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth= breadth;
    }

    @Override
    double area() {
        return (length*breadth);
    }

    @Override
    double perimeter() {
        return 2*(length+breadth);
    }


    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor()
                + " and area is : " + area()  + " and perimeter is : " + perimeter();
    }
}

class Triangle extends Shape {

    double height;
    double base;

    public Triangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base= base;
    }

    @Override
    double area() {
    return (height*base)/2;
    }

    @Override
    double perimeter() {
    return (base) *3;
    }

    @Override
    public String toString() {
        return "Triangle color is " + super.getColor()+ " and area is : " + area()+ " and perimeter is : " + perimeter();
    }
}

public class Report {

    public static void main(String[] args) {

        Circle c = new Circle("Red", 5);
        Rectangle r = new Rectangle("blue",4, 15);
        Triangle t = new Triangle("Green", 10, 13);

        System.out.println(c);
        System.out.println(r);
        System.out.println(t);
    }
}