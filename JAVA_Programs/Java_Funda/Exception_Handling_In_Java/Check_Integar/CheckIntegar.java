package Question_2;

import java.util.Scanner;

public class CheckIntegar {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter The 1st Number");
        int num1 = number.nextInt();
        System.out.println("Enter The 2nd Number");
        int num2 = number.nextInt();
        try{
            int a = num1;
            int b = num2;
            System.out.println("The quotient of " + a + "/" + b + " = " + a/b);
        } catch (ArithmeticException e){
            System.out.println("DivideByZeroException caught");
        } finally {
            System.out.println("Inside finally block");
            number.close();
        }
    }
}
