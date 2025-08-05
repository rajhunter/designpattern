package solid.srp;

public class BankService {
    Double balance = 10.0;
    public double deposit(long amount , String acNumber){
        return balance+amount;
    }
    public double withdraw(long amount , String acNumber){
        return balance>amount?balance-amount:0;

    }


}
