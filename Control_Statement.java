import java.util.Scanner;

public class Control_Statement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the First number:");
        int a=s.nextInt();
        System.out.print("Enter the First number:");
        int b=s.nextInt();
        if(a+b>=0)
            System.out.print((a+b)+" is positive value");
        else
            System.out.print((a+b)+" is negative value");
    }
}
