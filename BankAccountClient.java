import java.util.*;
public class BankAccountClient{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        BankAccount ba=new BankAccount();
        System.out.println("Enter 1 to withdraw\nEnter 2 to deposit\nEnter 3 to checkBalance ");
        int n=scan.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("enter the amount you want to withdraw");
            double amountwithdrawn=scan.nextDouble();
            System.out.println("amount left"+ba.withdraw(amountwithdrawn));
            break;
            case 2:
            System.out.println("Enter the amount you want to deposit");
            double depositamount=scan.nextDouble();
           System.out.println("amount left"+ ba.deposit(depositamount));
            break;
            case 3: 
          System.out.println(ba.checkBalance());
            break;
        }
        

    }
}