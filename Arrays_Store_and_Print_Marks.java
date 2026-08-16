import java.util.Scanner;

public class Arrays_Store_and_Print_Marks {
    public static void main(String[] args) {
        int[] Mark = new int[5];
        Scanner sc =new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            System.out.print("Enter the mark of student"+(i+1)+":");
            Mark[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            System.out.println("student"+(i+1)+"Mark:"+Mark[i]);
        }
    }
}
