package Question_3;
import java.util.Scanner;
import javax.naming.InsufficientResourcesException;
public class AccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Money You Want To Deposit");
        int deposit_money = scanner.nextInt();
        System.out.println("Enter Money You Want To Withdraw");
        int withdraw_money = scanner.nextInt();
        try {
            Account account = new Account();
        account.setAccountNumber("20555456678");
        account.deposit(deposit_money);
        account.withdraw(withdraw_money);
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Thanks, Visit Again");
            scanner.close();
        }
    }

}

