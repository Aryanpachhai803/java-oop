package Day_26;

public class TicketBooking extends Thread {
    static int availableTickets = 5;
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
    }
}