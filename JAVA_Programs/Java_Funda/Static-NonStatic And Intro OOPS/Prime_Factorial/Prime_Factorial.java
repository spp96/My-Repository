package Q2;

public class Prime_Factorial {
    static void prime_factors(int n){
        if (n > 1 && n<=100){
            String res = "";
            for (int i=1;i <=n;i++){
                if (n%i == 0){
                    res+=i+" ";
                }
            }
            System.out.println(res);
        } else {
            System.out.println("Invalid number");
        }
    }

    public static void main(String[] args) {
        int n = 12;
        prime_factors(n);
    }
}
