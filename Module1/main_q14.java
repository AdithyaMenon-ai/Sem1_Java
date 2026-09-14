import java.util.Scanner;

class Account {
    private String accNo;
    private String holderName;
    private double balance;

    public Account(String accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        // The problem's sample provides only the number of operations,
        // so the account starts with zero balance.
        Account account = new Account("A001", "User", 0);

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");

            if (command[0].equalsIgnoreCase("deposit")) {
                double amount = Double.parseDouble(command[1]);
                account.deposit(amount);

            } else if (command[0].equalsIgnoreCase("withdraw")) {
                double amount = Double.parseDouble(command[1]);
                account.withdraw(amount);

            } else if (command[0].equalsIgnoreCase("getBalance")) {
                System.out.println("Balance: " + account.getBalance());
            }
        }

        sc.close();
    }
}
