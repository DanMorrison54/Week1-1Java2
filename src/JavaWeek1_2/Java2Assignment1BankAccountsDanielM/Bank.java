package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @Author Daniel Morrison
 *
 * a bank class that merely holds and updates accounts
 */
 class Bank
{


    private Account[] accounts; //an array of all the accounts the bank has

    /**
     *
     * @param accounts the accounts the bank has been passed, however I will state if requested I would have heavily preferred to make this an ArrayList and have an addToBankMethod for adding
     *                 new accounts instead of having to pass them all in, this methodology seems crude to me. However my teacher requested the use of a standard Array.
     */
    Bank(Account[] accounts){
        this.accounts= Arrays.copyOf(accounts,3); //copying passed in Array to this account
    }

    /**
     * updates all savings account the bank has by one payment period, and also checks if any chequing accounts are in overdraft
     */
     void update(){
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

    /**
     *
     * @return retuns the Account array so a user can obtain what accounts the bank has
     */
    public Account[] getAccounts() {
        return accounts;
    }

    /**
     *
     * @param accounts new account array, allows user to change the accounts that bank has.
     */
    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
