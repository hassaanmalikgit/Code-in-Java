abstract class VisitorPass {
    abstract int calculateTicketPrice(int numberOfVisitors);
}

class VIPPass extends VisitorPass {
    @Override
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 1000;
    }
}
class FamilyPass extends VisitorPass {
    @Override
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 500;
    }
}

class GeneralPass extends VisitorPass {
    @Override
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 300;
    }
}

class TicketSystem {
    public static void main(String[] args) {
        VisitorPass vip = new VIPPass();
        VisitorPass family = new FamilyPass();
        VisitorPass general = new GeneralPass();

        int vipVisitors = 15;
        int familyVisitors = 25;
        int generalVisitors = 35;

        int vipPrice = vip.calculateTicketPrice(vipVisitors);
        int familyPrice = family.calculateTicketPrice(familyVisitors);
        int generalPrice = general.calculateTicketPrice(generalVisitors);

        System.out.println("VIP Pass Price for " + vipVisitors + " visitors: Rs. " + vipPrice);
        System.out.println("Family Pass Price for " + familyVisitors + " visitors: Rs. " + familyPrice);
        System.out.println("General Pass Price for " + generalVisitors + " visitors: Rs. " + generalPrice);
    }
}
