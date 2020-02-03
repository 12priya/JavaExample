public class BankAccount{
    double balance=1000;
    public double withdraw(double amount){
        if(balance<=0)
        {
            System.out.println("insufficient balance");
        }
            return balance-amount;
    }

    public double deposit(double amount){
            return balance+amount;
    }

    public double checkBalance(){
        return balance;
    }
}