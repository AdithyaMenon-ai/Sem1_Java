import java.util.Scanner;

class Room {
    private String roomNumber;
    private String block;
    private String type;

    public Room() {
    }

    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber + " " + block + " " + type;
    }
}

class Student {
    private String name;
    private int roll;
    private String course;
    private Room room;

    public Student() {
    }

    public Student(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course
                + "\n\n" + room;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] studentData = sc.nextLine().split(",");

        Student student = new Student(
                studentData[0].trim(),
                Integer.parseInt(studentData[1].trim()),
                studentData[2].trim(),
                null
        );

        String[] roomData = sc.nextLine().split(",");

        Room room = new Room(
                roomData[0].trim(),
                roomData[1].trim(),
                roomData[2].trim()
        );

        student.setRoom(room);

        System.out.println(student);

        sc.close();
    }
}
