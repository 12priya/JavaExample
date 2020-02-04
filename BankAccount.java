public class BankAccount{
private double balance=10_000;
    private Address address;
    private AccountType accountType;
private static int initial_account_id_value=1000;
private int accountId;


    public BankAccount(AccountType accountType,double initialBalance, Address address){

        if(initialBalance>10000)
        {
            this.balance=initialBalance;
        }
        this.address=address;
        this.accountType=accountType;
        this.accountId=++initial_account_id_value;
    }

    public BankAccount(AccountType accountType,Address address)
    {
        this.address=address;
        this.accountId=accountId;
        this.accountType=accountType;
    }

    public double withdraw(double amount){

        switch(this.accountType){
            case SALARIED_ACCOUNT: this.balance-=amount;
                                    break;
                                    
            case CURRENT_ACCOUNT: if((this.balance-amount)>25_000)
            this.balance-=amount;
            break;

            case SAVINGS_ACCOUNT: if((this.balance-amount)>10_000)
            this.balance-=amount;
            break;
        }
        return amount;
        // if((this.balance-amount)>10_000)
        // {
        //     this.balance-=amount;
        //         return this.balance;
        // }
        //     return 0;
    }

    public double deposit(double amount){
            return this.balance+=amount;
    }

    public double checkBalance(){
        return this.balance;
    }
    

    public void updateAddress(Address address){
        this.address=address;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public static int getAccountID(){
        return initial_account_id_value;
    }
}