import java.util.Scanner;

class Vehicle {
    private String regNo;
    private String brand;
    private double baseRate;

    public Vehicle() {
    }

    public Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public double calculateRent() {
        return baseRate;
    }

    public String getType() {
        return "Vehicle";
    }

    @Override
    public String toString() {
        return getType() + " " + regNo + " " + brand
                + " Rent: " + calculateRent();
    }
}

class Car extends Vehicle {

    public Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return getBaseRate() * 1.5;
    }

    @Override
    public String getType() {
        return "Car";
    }
}

class Bike extends Vehicle {

    public Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return getBaseRate() * 1.2;
    }

    @Override
    public String getType() {
        return "Bike";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] carData = sc.nextLine().split(",");

        Vehicle car = new Car(
                carData[1].trim(),
                carData[2].trim(),
                Double.parseDouble(carData[3].trim())
        );

        String[] bikeData = sc.nextLine().split(",");

        Vehicle bike = new Bike(
                bikeData[1].trim(),
                bikeData[2].trim(),
                Double.parseDouble(bikeData[3].trim())
        );

        System.out.println(car);
        System.out.println(bike);

        sc.close();
    }
}
