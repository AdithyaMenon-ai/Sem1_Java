class PrinterJob implements Runnable {
    int job;
    String student;

    PrinterJob(int job, String student) {
        this.job = job;
        this.student = student;
    }

    public void run() {
        try {
            System.out.println("Printing job " + job + " by " + student);
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class UniversityPrinting {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrinterJob(1, "Student A"));
        Thread t2 = new Thread(new PrinterJob(2, "Student B"));
        Thread t3 = new Thread(new PrinterJob(3, "Student C"));

        t1.start();
        t2.start();
        t3.start();
    }
}
