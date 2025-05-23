class Computer {
    private String companyName;
    private double price;

    Computer(String name, double price) {
        this.companyName = name;
        this.price = price;
    }
    String getCompanyName() {
        return companyName;
    }

    double getPrice() {
        return price;
    }

    void show() {
        System.out.println("Company: " + companyName);
        System.out.println("Price: " + price);
    }
}
class Desktop extends Computer {
    String color, processor;

    Desktop(String name, double price, String color, String processor) {
        super(name, price);
        this.color = color;
        this.processor = processor;
    }
    @Override
    void show() {
        System.out.println("Desktop:");
        System.out.println("Company: " + getCompanyName());
        System.out.println("Price: " + getPrice());
        System.out.println("Color: " + color);
        System.out.println("Processor: " + processor);
    }
}
class Laptop extends Computer {
    String color, processor;

    Laptop(String name, double price, String color, String processor) {
        super(name, price);
        this.color = color;
        this.processor = processor;
    }

    @Override
    void show() {
        System.out.println("Laptop:");
        System.out.println("Company: " + getCompanyName());
        System.out.println("Price: " + getPrice());
        System.out.println("Color: " + color);
        System.out.println("Processor: " + processor);
    }
}

 class Main {
    public static void main(String[] args) {
        Computer c;

        c =  new Desktop("Dell", 35000, "Black", "i5");
        c.show();

        System.out.println();

        c = new Laptop("HP", 45000, "Silver", "i6");
        c.show();
    }
}

