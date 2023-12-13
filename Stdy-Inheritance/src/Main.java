public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Fernando", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Abc",0.0,500.0);

        //UPCASTING
        //upcasting = converter um objeto da  subclasse para a superclasse

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Ana",0.0,300.0);

        //DOWNCASTING
        // downcasting = converter um objeto da super classe para a subclasse

        BusinessAccount acc4 = (BusinessAccount) acc2;
//        BusinessAccount acc5 = (BusinessAccount)acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }else if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}