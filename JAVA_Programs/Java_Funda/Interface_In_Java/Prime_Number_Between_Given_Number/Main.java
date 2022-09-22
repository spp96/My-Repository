package Question_4;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Number");
            int prime  = input.nextInt();
            Test test = new Test();
            int [] arr = test.display(prime);
            System.out.println(Arrays.toString(arr));
    }
}
