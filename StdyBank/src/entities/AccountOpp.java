package entities;
import java.util.Scanner;
public class AccountOpp {

    public static Scanner sc = new Scanner(System.in);
    private String name;
    private final int accountNumber;
    private double firstDeposit;

    private double balance;

    public AccountOpp(String name, int accountNumber, double firstDeposit){
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(firstDeposit);
    }

    public AccountOpp(String name, int accountNumber){
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(0);
    }

    public double getFirstDeposit() {
        return firstDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setFirstDeposit(double firstDeposit) {
        this.firstDeposit = firstDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double withdraw(double value){
        return balance -= (value + 5);
    }
    public double deposit(double value){
        return balance += value;
    }

    public String toString(){
        return  "Account: " + getAccountNumber()
                +", Holder: " + getName()
                +", Balance: $ " + String.format("%.2f",getBalance());
    }

}
