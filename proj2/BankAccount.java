// created a banking application and used encapsulation propery to secure the account.


public class BankAccount{
    private String owner;
    private double balance;

    BankAccount(String owner, double StartingBalance){
        this.owner = owner;
        this.balance = Math.max(StartingBalance,0);
    }
    public double withdraw(double withdraw_amt){
        if(withdraw_amt <= this.balance){
            this.balance = this.balance - withdraw_amt; 
            return withdraw_amt;
        }
        return 0;
    }
    public double deposit(double deposit_amt){
        if(deposit_amt>0){
            this.balance = this.balance + deposit_amt;
            return deposit_amt;
        }
        return 0;
    }

    public String getOwner(){
        return this.owner;
    }
    public double getBalance(){
        return this.balance;
    }
}