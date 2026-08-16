import java.util.Scanner;

public class Mini_Project_Average_and_Grade {
    public static void main(String[] args) {
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter the mark of Subject"+(i+1)+":");
            a[i]=sc.nextInt();
        }
        int s=0;
        for(int i:a)
        {
            s+=i;
        }
        double avg=(s/a.length);
        if(avg>=90)
            System.out.print("You got A in exam");
        else if (avg>=75)
            System.out.print("You got B in exam");
        else if (avg>=50)
            System.out.print("You got C in exam");
        else
            System.out.print("You Fail in exam Try Again");
    }
}
