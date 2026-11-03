import java.util.Scanner;

class UniversityLogin {

    static void login(String username) {
        if (username == null || username.equals("null")) {
            throw new NullPointerException("Username cannot be null");
        }

        System.out.println("Login successful");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            login(username);
        }
        catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
