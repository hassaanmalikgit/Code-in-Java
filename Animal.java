
class Animal{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //default constructor
    Animal(){
        this.name = "unknown";
        this.age = 0;
    }

    //parameterized constructor
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void Sound()
    {
        System.out.println("voice");
    }
}

class Cat extends Animal{
    private String type;
    private String furColor;


    //getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    //default constructor
    Cat()
    {
        super();
        this.type = "xyz";
        this.furColor = "def";
    }

    //paremterized constructor
    Cat(String name, int age, String type, String furColor)
    {
        super(name, age);
        this.type = type;
        this.furColor = furColor;
    }

    void DisplayData()
    {
        System.out.println(getname());
        System.out.println(getage());
        System.out.println(type());
        System.out.println(furColor());
    }
    void Meow()
    {
        System.out.println(getname() + " meow");
    }
}


public class Main {
    public static void main(String[] args) {
        Cat cat_obj = new Cat("tom", 5, "Persian", "Brown");
        cat_obj.DisplayData();

    }
}