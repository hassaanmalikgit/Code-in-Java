interface PaymentMethod {
    boolean authenticate();
    boolean processPayment(double amount);
}
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public boolean authenticate() {
        return cardNumber.length() == 16;
    }

    @Override
    public boolean processPayment(double amount) {
        if (authenticate()) {
            System.out.println("Credit card payment of $" + amount + " processed.");
            return true;
        } else {
            System.out.println("Credit card authentication failed.");
            return false;
        }
    }
}

class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean authenticate() {
        return true; // Simplified for testing
    }

    @Override
    public boolean processPayment(double amount) {
        if (authenticate()) {
            System.out.println("PayPal payment of $" + amount + " processed.");
            return true;
        } else {
            System.out.println("PayPal authentication failed.");
            return false;
        }
    }
}
class CryptoPayment implements PaymentMethod {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }
    @Override
    public boolean authenticate() {
        return walletAddress.startsWith("0x");
    }

    @Override
    public boolean processPayment(double amount) {
        if (authenticate()) {
            System.out.println("Cryptocurrency payment of $" + amount + " processed.");
            return true;
        } else {
            System.out.println("Cryptocurrency authentication failed.");
            return false;
        }
    }
}

class PaymentSystem {
    public static void main(String[] args) {
        double purchaseAmount = 200.50;

        PaymentMethod creditCard = new CreditCardPayment("1234567812345678");
        PaymentMethod paypal = new PayPalPayment("user@example.com");
        PaymentMethod crypto = new CryptoPayment("0xAbc123XYZ");

        System.out.println("--- Credit Card ---");
        creditCard.processPayment(purchaseAmount);

        System.out.println("--- PayPal ---");
        paypal.processPayment(purchaseAmount);

        System.out.println("--- Crypto ---");
        crypto.processPayment(purchaseAmount);
    }
}
