public class AccountManager {
    private double balance; //hesap

    public void deposit (double amount){ //para yatır fonks miktar parametre
        balance = getBalance() + amount;
    }

    public void withdraw (double amount) throws BalanceInsufficentException { //para çek.
        if(balance >= amount){
            balance = getBalance() - amount;
        }
        else{
           throw new BalanceInsufficentException("Hesap Bakiyesi Yetersiz.");
        }

    }

    public double getBalance() {
        return balance;
    }
}
