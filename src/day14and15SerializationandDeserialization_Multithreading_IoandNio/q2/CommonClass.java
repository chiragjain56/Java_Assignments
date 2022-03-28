package day14and15SerializationandDeserialization_Multithreading_IoandNio.q2;

public class CommonClass {
    private int balance;


    public synchronized void withdrawMoney(int amount){
        if(this.balance<amount){
            System.out.println("No Sufficient balance in your account");
            return;
        }
        this.balance = this.balance-amount;
        System.out.println(amount+" has been withdrawn and "+this.balance+" is your current balance");
        return;
    }

    public synchronized void setBalance(int amount) {
        if(amount<=0){
            System.out.println("Please enter valid amount to deposit");
            return;
        }
        this.balance = this.balance+amount;
        System.out.println("Amount has been credited");
    }
}
