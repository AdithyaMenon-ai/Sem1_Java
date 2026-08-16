import java.util.Arrays;
public class Arrays_and_Loops_Find_Maximum {
    public static void main(String[] args) {
        int [] a={51,88,46,12,87,24,66,85,152,22};
        Arrays.sort(a);

        System.out.print(a[a.length-1]);
    }
}
