package Unit4.day9.q2;

import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        SavingAccount savingAccount  = new  SavingAccount();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit ");
        double amount1 = sc.nextInt();
        savingAccount.deposit(amount1);

        System.out.println("Enter the amount to withdraw ");
        double amount2 = sc.nextInt();

        try{
            int money  = (int)savingAccount.withdraw(amount2);
            System.out.println("money " + money + " in your account");
        }catch (InsufficientResourcesException e){
            System.out.println(e.getMessage());
        }
    }
}
