
public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public BankAccount (String accountNumber, String accountHolder, double balance, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean hasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public void withdraw (double amount) {
        this.balance -= amount;
    }

    public void addInterest (int interestRate) {
        this.balance += this.balance * (interestRate / 100.0);
    }

    @Override
    public String toString () {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance= £" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }


    public static void main (String[] args) {

        BankAccount Account001 = new BankAccount(accountNumber: "78325123", acountHolder"Richard Branson", HasOverdraft false);
        String(Account001);
        Account001.setBalance(1500.0);
        System.out.print("Depositing" + Account001.balance "...");

        String(Account001);
        System.out.print("Balance is now" + Account001.getBalance() + "");

        Account001.withdraw(250.0);
        System.out.print("Withdrawing £" + Account001.amount + "");
        String(Account001);

        //gets the new balance
        System.out.print("Balance is now" + Account001.getBalance() + "");

        Account001.addInterest(10);
        String(Account001);

        System.out.print("Final Balance is" + Account001.getBalance() + "");


    }

}