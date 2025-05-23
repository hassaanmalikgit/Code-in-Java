interface Draw {
    void draw();
}

interface Shape extends Draw {
    String shapeType();
    double calculateArea();
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public String shapeType() {
        return "Rectangle";
    }

    public void draw() {
        System.out.println("Drawing " + shapeType());
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }
    public String shapeType() {
        return "Circle";
    }

    public void draw() {
        System.out.println("Drawing " + shapeType());
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}
class Square implements Shape {
    double length;
    double width;

    Square(double l, double w) {
        length = l;
        width = w;
    }

    public String shapeType() {
        return "Square";
    }

    public void draw() {
        System.out.println("Drawing " + shapeType());
    }

    public double calculateArea() {
        return length * width;
    }
}
 class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        Circle c = new Circle(3);
        Square s = new Square(4, 4);

        System.out.println("Shape: " + r.shapeType());
        r.draw();
        System.out.println("Area: " + r.calculateArea());
        System.out.println();

        System.out.println("Shape: " + c.shapeType());
        c.draw();
        System.out.println("Area: " + c.calculateArea());
        System.out.println();

        System.out.println("Shape: " + s.shapeType());
        s.draw();
        System.out.println("Area: " + s.calculateArea());
    }
}
