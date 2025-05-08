interface Display {
    void show();
}

interface Aircraft extends Display {
    String aircraftType();
    int calculateCapacity();
}

class PassengerJet implements Aircraft {
    private int rows;
    private int seatsPerRow;

    public PassengerJet(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }

    @Override
    public String aircraftType() {
        return "Passenger Jet";
    }

    @Override
    public int calculateCapacity() {
        return rows * seatsPerRow;
    }

    @Override
    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Passenger Capacity: " + calculateCapacity());
    }
}

class CargoPlane implements Aircraft {
    private int length;
    private int width;

    public CargoPlane(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String aircraftType() {
        return "Cargo Plane";
    }

    @Override
    public int calculateCapacity() {
        return (length * width) / 5; // Conversion to passenger-equivalent capacity
    }

    @Override
    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Capacity: " + calculateCapacity());
    }
}

class PrivateJet implements Aircraft {
    private int seats;

    public PrivateJet(int seats) {
        this.seats = seats;
    }

    @Override
    public String aircraftType() {
        return "Private Jet";
    }

    @Override
    public int calculateCapacity() {
        return seats;
    }

    @Override
    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Luxury Seat Capacity: " + calculateCapacity());
    }
}

class AirlineManagement {
    public static void main(String[] args) {
        Aircraft passengerJet = new PassengerJet(30, 6);
        Aircraft cargoPlane = new CargoPlane(50, 20);
        Aircraft privateJet = new PrivateJet(30);

        System.out.println("*** Passenger Jet ***");
        passengerJet.show();
        System.out.println();

        System.out.println("*** Cargo Plane ***");
        cargoPlane.show();
        System.out.println();

        System.out.println("*** Private Jet ***");
        privateJet.show();
    }
}
