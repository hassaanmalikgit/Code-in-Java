// Abstract base class
abstract class Shape {
    public static final double PI = 3.14;
    protected float height;
    protected float width;

    // Abstract method to calculate area
    abstract float area();
}

// Square class extending Shape
class Square extends Shape {
    // Constructor for Square
    Square(float h, float w) {
        height = h;
        width = w;
    }

    // Implementation of area calculation for square
    @Override
    float area() {
        return height * width;
    }
}

class Rectangle extends Shape {
    // Constructor for Rectangle
    Rectangle(float h, float w) {
        height = h;
        width = w;
    }

    // Implementation of area calculation for rectangle
    @Override
    float area() {
        return height * width;
    }
}

class Circle extends Shape {
    float radius;

    // Constructor for Circle
    Circle(float r) {
        radius = r;
    }
    // Implementation of area calculation for circle
    @Override
    float area() {
        return (float) (Shape.PI * radius * radius);
    }
}

// Main class to demonstrate the shape hierarchy
class AbstractMethodDemo {
    public static void main(String args[]) {
        Square sObj = new Square(5, 5);
        Rectangle rObj = new Rectangle(5, 7);
        Circle cObj = new Circle(2);

        System.out.println("Area of square: " + sObj.area());
        System.out.println("Area of rectangle: " + rObj.area());
        System.out.println("Area of circle: " + cObj.area());
    }
}