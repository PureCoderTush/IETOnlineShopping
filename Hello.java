package hello;
//changes done
public class Account{
    private float balance;
    public Account(){
        this.balance=5000;
    }
    public Account(float initialBalance){
        this.balance=initialBalance;
        
    }
    public void deposit(int cash)
    {
        this.balance+=cash;
    }
}
