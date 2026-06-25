class Circle {
    double r;
    Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }

    double circumference() {
        return 2 * Math.PI * r;
    }

    void display() {
        System.out.println("Radius : " + r);
        System.out.println("Area : " + area());
        System.out.println("Circumference : " + circumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
    }
}