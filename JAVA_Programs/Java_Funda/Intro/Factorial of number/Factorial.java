package Question5;

public class Factorial {
    public static void main(String [] args){
        fact();
    }
    static void fact(){
        int a = 5;
        int fact = 1;
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
