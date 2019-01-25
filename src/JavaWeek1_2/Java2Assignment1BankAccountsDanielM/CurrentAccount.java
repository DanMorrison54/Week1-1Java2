package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;

import java.math.BigInteger;

/**
 * @Author
 * my implementation for chequing account basically.
 */
public class CurrentAccount extends Account {
   private double limit; // only field unique to this class is limit, rest is inherited.

    /**
     *
     * @param bal starting balance
     * @param accNum  account number, fairly self explanitory just giving an account number upon creation.
     * @param limit overdraft limit (how far in the negative the account can go)
     * @throws IllegalArgumentException throws illegal argument exception if overdraft limit is less than or equal to zero, as that would make no sense or if account number is not 12 digits.
     */
    CurrentAccount(double bal, long accNum,double limit )throws IllegalArgumentException {
        //accNum>=100000000000L||accNum<999999999999L
        if (bal <= 0 || limit<0||(accNum>=10000000000L&&accNum<99999999999L))
            throw new IllegalArgumentException("balance or rate cannot be less than or equal to zero");
        else {
            this.setBal(bal);
            this.limit=limit;
            this.setAccNum(accNum);
        }

    }

    /**
     *
     * @param sum sum of money to withdraw from account
     * @throws IllegalArgumentException throws exception if ammount is less than or equal to zero
     */
    @Override
    public void withdraw(double sum) throws IllegalArgumentException {
if(sum<=0)
    throw new IllegalArgumentException("amount withdrawn must be greater then zero");

//        if((this.getBalance()+limit)-sum<0){
//            System.out.println("balance cannot be lower then the overdraft limit"); code fragment im leaving in, I initially also wanted to stop it from ever reaching overdraft, however
// the assignment specifies me to create a warning when accounts in overdraft, so it had to be scrapped.
//        }
        else
            this.setBal(this.getBalance()-sum);
    }

    /**
     *
     * @return returns weather or not account is in overdraft
     */
     boolean isOverdraft(){
        return (getBalance()<limit*-1);
    }

    /**
     *
     * @return a string when object is printed as a string as specified by Java.lang.Object.toString(), to show the user the account number, current balance and overdraft limit
     */
    @Override
    public String toString() {
        return "chequing account num: "+new BigInteger(Long.toString((getAccountNumber())))+" balance: "+getBalance()+" overdraft limit;"+limit;
    }
}
