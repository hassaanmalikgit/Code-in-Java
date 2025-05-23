class Person {
    String personName;
    int age;

    void print() {
        System.out.println("Name: " + personName);
        System.out.println("Age: " + age);
    }
}

class Patient extends Person {
    String diseaseType;
    String recommendedMedicine;

    @Override
    void print() {
        super.print();
        System.out.println("Disease: " + diseaseType);
        System.out.println("Medicine: " + recommendedMedicine);
    }
}

class MedicarePatient extends Patient {
    String hospitalName;
    String wardName;
    int roomNumber;

    @Override
    void print() {
        super.print();
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Ward: " + wardName);
        System.out.println("Room No: " + roomNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.personName = "Ali";
        p.age = 30;
        p.diseaseType = "Flu";
        p.recommendedMedicine = "Panadol";

        MedicarePatient mp = new MedicarePatient();
        mp.personName = "Sara";
        mp.age = 45;
        mp.diseaseType = "Heart";
        mp.recommendedMedicine = "Aspirin";
        mp.hospitalName = "City Hospital";
        mp.wardName = "Cardiology";
        mp.roomNumber = 205;

        Person ref;

        System.out.println("Patient Info:");
        ref = p;   // dynamic binding
        ref.print();

        System.out.println("\nMedicare Patient Info:");
        ref = mp;  // dynamic binding
        ref.print();
    }
}
