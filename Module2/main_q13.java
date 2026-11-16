import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Guest {
    private String name;
    private int age;
    private String idProof;

    public Guest() {
    }

    public Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + idProof;
    }
}

class Reservation {
    private String reservationId;
    private String roomType;
    private List<Guest> guests;

    public Reservation() {
        guests = new ArrayList<>();
    }

    public Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Reservation ID: ").append(reservationId)
          .append(" Room: ").append(roomType)
          .append("\nGuests:\n\n");

        for (Guest guest : guests) {
            sb.append(guest).append("\n");
        }

        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] reservationData = sc.nextLine().split(",");
        int numberOfGuests = Integer.parseInt(sc.nextLine().trim());

        Reservation reservation = new Reservation(
                reservationData[0].trim(),
                reservationData[1].trim()
        );

        for (int i = 0; i < numberOfGuests; i++) {
            String[] guestData = sc.nextLine().split(",");

            Guest guest = new Guest(
                    guestData[0].trim(),
                    Integer.parseInt(guestData[1].trim()),
                    guestData[2].trim()
            );

            reservation.addGuest(guest);
        }

        System.out.print(reservation);

        sc.close();
    }
}
