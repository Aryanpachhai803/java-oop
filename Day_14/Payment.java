package Day_14;

interface Pay {
    void pay(double amount);
}

class CreditCardPayment implements Pay {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}


public class Payment {
    public static void main(String[] args) {

    }
}