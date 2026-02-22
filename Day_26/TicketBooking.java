package Day_26;
import java.util.Scanner;
public class TicketBooking extends Thread {
    static int availableTickets;
    String userName;
    int ticketsRequested;

    TicketBooking(String userName, int ticketsRequested) {
        this.userName = userName;
        this.ticketsRequested = ticketsRequested;
    }

    void bookTicket() {
        System.out.println(userName + " trying to book " + ticketsRequested + " ticket(s)");

        if (ticketsRequested <= availableTickets) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            availableTickets -= ticketsRequested;
            System.out.println("Booking successful for " + userName);
            System.out.println("Tickets left: " + availableTickets);
        } else {
            System.out.println("Not enough tickets for " + userName);
        }

        System.out.println("----------------------------------");
    }

    public void run() {
        bookTicket();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total available tickets: ");
        availableTickets = sc.nextInt();

        System.out.print("Enter first user name: ");
        String name1 = sc.next();

        System.out.print("Enter tickets requested by " + name1 + ": ");
        int tickets1 = sc.nextInt();

        System.out.print("Enter second user name: ");
        String name2 = sc.next();

        System.out.print("Enter tickets requested by " + name2 + ": ");
        int tickets2 = sc.nextInt();

        TicketBooking t1 = new TicketBooking(name1, tickets1);
        TicketBooking t2 = new TicketBooking(name2, tickets2);

        t1.start();
        t2.start();

        sc.close();
    }
}