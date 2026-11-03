import java.util.Random;
import java.util.Scanner;

class SquareCalculator extends Thread {
    int num;

    SquareCalculator(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square: " + (num * num));
    }
}

class CubeCalculator extends Thread {
    int num;

    CubeCalculator(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube: " + (num * num * num));
    }
}

class RandomNumberGenerator extends Thread {
    public void run() {
        Random r = new Random();

        try {
            for (int i = 1; i <= 3; i++) {
                int num = r.nextInt(10) + 1;

                System.out.println("Generated: " + num);

                if (num % 2 == 0) {
                    SquareCalculator s = new SquareCalculator(num);
                    s.start();
                    s.join();
                }
                else {
                    CubeCalculator c = new CubeCalculator(num);
                    c.start();
                    c.join();
                }

                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class IoTSensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Start Simulation");
        System.out.println("2. Exit");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            RandomNumberGenerator r = new RandomNumberGenerator();
            r.start();
        }
        else {
            System.out.println("Exiting...");
        }

        sc.close();
    }
}
