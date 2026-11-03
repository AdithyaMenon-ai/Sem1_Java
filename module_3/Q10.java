class BankTransaction extends Thread {
    int amount;

    BankTransaction(int amount) {
        this.amount = amount;
    }

    public void run() {
        if (amount >= 50000) {
            System.out.println("High-value transaction processed first");
        }
        else {
            System.out.println("Low-value transaction processed later");
        }
    }
}

class Bank {
    public static void main(String[] args) {
        BankTransaction t1 = new BankTransaction(5000);
        BankTransaction t2 = new BankTransaction(50000);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t2.start();
        t1.start();
    }
}
