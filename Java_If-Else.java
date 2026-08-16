import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2!=0)
        {
           System.out.print("Weird"); 
        }
        else
        {
            if(2<=n && 5>=n||n>20)
            {
                System.out.print("Not Weird"); 
            }
            else
            {
                System.out.print("Weird"); 
            }
        }
        scanner.close();
    }
}
