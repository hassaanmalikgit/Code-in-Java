abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    int mark1, mark2, mark3;

    A(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    double getPercentage() {
        int total = mark1 + mark2 + mark3;
        return (total / 300.0) * 100;
    }
}

class B extends Marks {
    int mark1, mark2, mark3, mark4;

    B(int m1, int m2, int m3, int m4) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
    }

    double getPercentage() {
        int total = mark1 + mark2 + mark3 + mark4;
        return (total / 400.0) * 100;
    }
}

 class Main {
    public static void main(String[] args) {
        try {
            A studentA = new A(80, 90, 85);
            B studentB = new B(75, 65, 85, 70);

            System.out.println("Student A Percentage: " + studentA.getPercentage() + "%");
            System.out.println("Student B Percentage: " + studentB.getPercentage() + "%");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
