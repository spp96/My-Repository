package Question_4;
import java.util.Scanner;
public class Factorial_Number {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of input");
        int num = userInput.nextInt();
        int res = 1;
        Number[] array = new Number[num];
        if(array.length >3){
            System.out.println("Error");
            return;
        }
        if(array.length == 1){
            System.out.println("Enter  one number of input");
            int number = userInput.nextInt();
            for(int i  = 1; i <= number; i++){
                res *= i;
            }
        }
        if(array.length == 2){
            System.out.println("Enter  two number of input");

            int number1 = userInput.nextInt();
            int number2 = userInput.nextInt();
            int number = Math.abs(number1-number2);
            for(int i  = 1; i <= number; i++){
                res *= i;
            }
        }
        System.out.println("Result"+" " + res);
    }
}
