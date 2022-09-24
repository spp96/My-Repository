package Question_3;

public class Account {
    String accountNumber;
    double balance;

    public void deposit(int amount){
        balance = amount;
    }
    public double withdraw(int amount) throws InsufficientFundsException {
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient Balance In Your Account");
        }else{
            balance -= amount;
            System.out.println(amount + " Rs Amount Deducted from your account");
        }
        return 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}