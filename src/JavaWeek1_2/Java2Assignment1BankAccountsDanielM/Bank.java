package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;

import java.math.BigInteger;
import java.util.Arrays;

public class Bank
{
    Account[] accounts;
    Bank(Account[] accounts){
        this.accounts= Arrays.copyOf(accounts,3);
    }
    public void update(){
        for(Account acc:accounts){
            if(acc.getClass().equals(SavingsAccount.class)){

                ((SavingsAccount) acc).principleWithInterest(1);
            }
            else if(acc.getClass().equals(CurrentAccount.class)){
            acc.withdraw(5000);
               if( ((CurrentAccount) acc).isOverdraft()) System.out.println("chequing account "+new BigInteger(Long.toString(acc.getAccountNumber()))+" is in overdraft");
            }
            System.out.println(acc.toString());
        }
        System.out.println("finished updating account statuses");
    }
}
