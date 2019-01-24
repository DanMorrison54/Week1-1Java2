package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;

import java.math.BigInteger;

public class CurrentAccount extends Account {
    double limit;

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

    @Override
    public void withdraw(double sum) throws IllegalArgumentException {
if(sum<=0)
    throw new IllegalArgumentException("amount withdrawn must be greater then zero");

//        if((this.getBalance()+limit)-sum<0){
//            System.out.println("balance cannot be lower then the overdraft limit");
//        }
        else
            this.setBal(this.getBalance()-sum);
    }
    public boolean isOverdraft(){
        return (getBalance()<limit*-1);
    }
    @Override
    public String toString() {
        return "chequing account num: "+new BigInteger(Long.toString((getAccountNumber())))+" balance:  balance:"+getBalance()+" overdraft limit;"+limit;
    }
}
