package Day_26;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial account balance: ₹");
        accountBalance = sc.nextInt();

        System.out.print("Enter first user name: ");
        String name1 = sc.next();

        System.out.print("Enter withdrawal amount for " + name1 + ": ₹");
        int amount1 = sc.nextInt();

        System.out.print("Enter second user name: ");
        String name2 = sc.next();

        System.out.print("Enter withdrawal amount for " + name2 + ": ₹");
        int amount2 = sc.nextInt();

        AtmWithdrawl t1 = new AtmWithdrawl(name1, amount1);
        AtmWithdrawl t2 = new AtmWithdrawl(name2, amount2);

        t1.start();
        t2.start();

        sc.close();
    }
}