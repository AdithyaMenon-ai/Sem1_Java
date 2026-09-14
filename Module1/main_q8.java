import java.util.Scanner;

abstract class Loan {
    protected double principal;
    protected double rate;
    protected double time;

    public Loan(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public abstract double calculateInterest();
}

class HomeLoan extends Loan {

    public HomeLoan(double principal, double rate, double time) {
        super(principal, 8, time);
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

class CarLoan extends Loan {

    public CarLoan(double principal, double rate, double time) {
        super(principal, 10, time);
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Home Loan
        String[] homeData = sc.nextLine().split(",");

        Loan homeLoan = new HomeLoan(
                Double.parseDouble(homeData[1].trim()),
                8,
                Double.parseDouble(homeData[2].trim())
        );

        // Car Loan
        String[] carData = sc.nextLine().split(",");

        Loan carLoan = new CarLoan(
                Double.parseDouble(carData[1].trim()),
                10,
                Double.parseDouble(carData[2].trim())
        );

        System.out.println("Home Loan Interest: " +
                homeLoan.calculateInterest());

        System.out.println("Car Loan Interest: " +
                carLoan.calculateInterest());

        sc.close();
    }
}
