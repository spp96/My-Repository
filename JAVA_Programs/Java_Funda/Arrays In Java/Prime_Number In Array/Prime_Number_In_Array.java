package Question_3;
import java.util.Arrays;
public class Prime_Number_In_Array {

    public static void main(String[] args) {
        int[] arr = {20,22,21,5,6,4,13,7,9};
        Prime_Number_In_Array s1 = new Prime_Number_In_Array();
        int [] ans = s1.findAndReturnPrimeNumbers(arr);
        if(ans.length == 0) {
            System.out.println("Prime number not found in the supplied Array");
        }
        else {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i]);
            }
        }

    }
    public boolean isPrime( int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public int[]  findAndReturnPrimeNumbers(int[] inputArray){

        int count = 0;
        for(int i=0; i<inputArray.length; i++){
            if(!isPrime(inputArray[i])){
                count++;

            }
        }
        int[] arr = new int[count];
        int line = 0;
        for(int i=0; i< inputArray.length; i++){
            if(!isPrime(inputArray[i])){
                arr[line++] = inputArray[i];

            }
        }
        return arr;
    }
}
