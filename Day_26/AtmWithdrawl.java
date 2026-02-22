package Day_26;


public class AtmWithdrawl extends Thread {

    static int accountBalance;
    String userName;
    int amountToWithdraw;

    AtmWithdrawl(String userName, int amountToWithdraw) {
        this.userName = userName;
        this.amountToWithdraw = amountToWithdraw;
    }

    void withdraw() {
        System.out.println(userName + " is trying to withdraw ₹" + amountToWithdraw);

        if (amountToWithdraw <= accountBalance) {

            try {
                Thread.sleep(100);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            accountBalance -= amountToWithdraw;
            System.out.println("Withdrawal successful for " + userName);
            System.out.println("Remaining Balance: ₹" + accountBalance);
        } else {
            System.out.println("Insufficient balance for " + userName);
        }

        System.out.println("----------------------------------");
    }

    public void run() {
        withdraw();
    }

    public static void main(String[] args) {
    }
}