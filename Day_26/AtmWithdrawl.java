package Day_26;


public class AtmWithdrawl extends Thread {
    static int accountBalance;
    String userName;
    int amountToWithdraw;

    AtmWithdrawl(String userName, int amountToWithdraw) {
        this.userName = userName;
        this.amountToWithdraw = amountToWithdraw;
    }


    public static void main(String[] args) {
    }
}