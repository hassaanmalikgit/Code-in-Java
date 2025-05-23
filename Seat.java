abstract class Seat {
    abstract int Calculate_Seat_Price(int nofseats);
}

class BusinessClass extends Seat {
    int pricePerSeat = 55000;  // Business Class price

    int Calculate_Seat_Price(int nofseats) {
        return nofseats * pricePerSeat;
    }
}

class FirstClass extends Seat {
    int pricePerSeat = 20000;

    int Calculate_Seat_Price(int nofseats) {
        return nofseats * pricePerSeat;
    }
}

class EconomyClass extends Seat {
    int pricePerSeat = 10000;  // Economy Class price

    int Calculate_Seat_Price(int nofseats) {
        return nofseats * pricePerSeat;
    }
}

public class Main {
    public static void main(String[] args) {
        BusinessClass bClass = new BusinessClass();
        FirstClass fClass = new FirstClass();
        EconomyClass eClass = new EconomyClass();

        int seatsBusiness = 2;
        int seatsFirst = 3;
        int seatsEconomy = 4;

        System.out.println("Business Class Fare for " + seatsBusiness + " seats: Rs. " + bClass.Calculate_Seat_Price(seatsBusiness));
        System.out.println("First Class Fare for " + seatsFirst + " seats: Rs. " + fClass.Calculate_Seat_Price(seatsFirst));
        System.out.println("Economy Class Fare for " + seatsEconomy + " seats: Rs. " + eClass.Calculate_Seat_Price(seatsEconomy));
    }
}
