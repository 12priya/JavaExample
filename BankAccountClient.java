import java.util.*;
public class BankAccountClient{
    public static void main(String[] args) {
        Address address = new Address("202", "street 3", "BAthinda", 151001);
        BankAccount bankaccount1=new BankAccount(AccountType.SAVINGS_ACCOUNT,20000,address);
        BankAccount bankaccount2=new BankAccount(AccountType.SAVINGS_ACCOUNT,20000,address);
        BankAccount bankaccount3=new BankAccount(AccountType.SAVINGS_ACCOUNT,20000,address);
        BankAccount bankaccount4=new BankAccount(AccountType.SAVINGS_ACCOUNT,20000,address);
        BankAccount bankaccount5=new BankAccount(AccountType.SAVINGS_ACCOUNT,20000,address);
        BankAccount bankaccount6=new BankAccount(AccountType.SAVINGS_ACCOUNT,20000,address);

        BankAccount bankaccount7=new BankAccount(AccountType.SAVINGS_ACCOUNT,20000,address);
        BankAccount bankaccount8=new BankAccount(AccountType.SAVINGS_ACCOUNT,20000,address);

        BankAccount bankaccount9=new BankAccount(AccountType.SAVINGS_ACCOUNT,20000,address);

        BankAccount bankaccount10=new BankAccount(AccountType.SALARIED_ACCOUNT,address);
System.out.println(bankaccount1.checkBalance());
System.out.println(BankAccount.getAccountID());

        // Scanner scan=new Scanner(System.in);
        
        // BankAccount ba=new BankAccount();
        // System.out.println("Enter 1 to withdraw\nEnter 2 to deposit\nEnter 3 to checkBalance ");
        // int n=scan.nextInt();
        // switch(n)
        // {
        //     case 1:
        //     System.out.println("enter the amount you want to withdraw");
        //     double amountwithdrawn=scan.nextDouble();
        //     System.out.println("amount left"+ba.withdraw(amountwithdrawn));
        //     break;
        //     case 2:
        //     System.out.println("Enter the amount you want to deposit");
        //     double depositamount=scan.nextDouble();
        //    System.out.println("amount left"+ ba.deposit(depositamount));
        //     break;
        //     case 3: 
        //   System.out.println(ba.checkBalance());
        //     break;
        // }
        

    }
}