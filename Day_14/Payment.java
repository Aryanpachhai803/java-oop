package Day_14;

interface Pay {
    void pay(double amount);
}

class CreditCardPayment implements Pay {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements Pay {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class CashPayment implements Pay {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash.");
    }
}

public class Payment {
    public static void main(String[] args) {

        Pay p1 = new CreditCardPayment();
        Pay p2 = new PayPalPayment();
        Pay p3 = new CashPayment();

        p1.pay(1000);
        p2.pay(500);
        p3.pay(200);
    }
}