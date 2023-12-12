import entities.AccountOpp;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AccountOpp account;

        System.out.print("Enter the account holder: ");
        String name = sc.nextLine();

        System.out.print("Enter the account number: ");
        int acNum = sc.nextInt();

        System.out.print("Is there an initial deposit (y/n)? ");
        char valid = sc.next().charAt(0);

        if(valid == 'y' || valid == 'Y'){
            System.out.print("Enter initial deposit value: ");
            double firstD = sc.nextDouble();
            account = new AccountOpp(name,acNum,firstD);
        }else{
            account = new AccountOpp(name,acNum);
        }

        System.out.print("\nAccount data: \n" + account);

        System.out.print("\n\nEnter a deposit value: ");
        double newD = sc.nextDouble();
        account.deposit(newD);

        System.out.print("Updated account data:\n");
        System.out.println("" + account);

        System.out.print("\nEnter a withdraw value: ");
        newD = sc.nextDouble();
        account.withdraw(newD);

        System.out.print("Updated account data:\n");
        System.out.println("" + account);

        sc.close();
    }

}