class TicketBooking {
    int availableSeats = 2;

    synchronized void bookSeat(int seats, String user) {
        if (availableSeats >= seats) {
            availableSeats = availableSeats - seats;

            System.out.println(user + " booked " + seats + " seat(s) successfully");
        }
        else {
            System.out.println(user + " booking failed. Not enough seats");
        }
    }
}

class User1 extends Thread {
    TicketBooking booking;

    User1(TicketBooking booking) {
        this.booking = booking;
    }

    public void run() {
        booking.bookSeat(1, "User1");
    }
}

class User2 extends Thread {
    TicketBooking booking;

    User2(TicketBooking booking) {
        this.booking = booking;
    }

    public void run() {
        booking.bookSeat(2, "User2");
    }
}

class RailwayBooking {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        User1 u1 = new User1(booking);
        User2 u2 = new User2(booking);

        u1.start();
        try {
            u1.join();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        u2.start();
    }
}
