import java.util.Scanner;

public class Loop_Multiplication_Table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter4 the number:");
        int a=s.nextInt();
        int i=1;
        while (i<=10)
        {
            System.out.println(i+"x"+a+'='+a*i);
            i++;
        }
    }
}
