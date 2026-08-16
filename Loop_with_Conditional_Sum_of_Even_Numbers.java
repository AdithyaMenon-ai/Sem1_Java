public class Loop_with_Conditional_Sum_of_Even_Numbers {
    public static void main(String[] args) {
        int a=0;
        for(int i=1;i<=50;i++) {
            if (i % 2 == 0)
                a += i;
        }
        System.out.print("Sum of even number from 1 to 50 is "+a);
    }
}
