package Day_26;

public class TicketBooking extends Thread {
    static int availableTickets = 5;
    String userName;
    int ticketsRequested;

    TicketBooking(String userName, int ticketsRequested) {
        this.userName = userName;
        this.ticketsRequested = ticketsRequested;
    }

    public static void main(String[] args) {
    }
}