package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;

public class CurrentAccount extends Account {
    double limit;

    CurrentAccount(double bal, long accNum,double limit )throws IllegalArgumentException {
        if (bal <= 0 || limit<0||(accNum>=100000000000L&&accNum<=999999999999L))
            throw new IllegalArgumentException("balance or rate cannot be less than or equal to zero");
        else {
            this.setBal(bal);
            this.limit=limit;
            this.setAccNum(accNum);
        }

    }

    @Override
    public void withdraw(double sum) throws IllegalArgumentException {

        if((this.getBalance()+limit)-sum<0){
            System.out.println("balance cannot be lower then the overdraft limit");
        }
        else
            this.setBal(this.getBalance()-sum);
    }
    public boolean isOverdraft(){
        return (getBalance()<limit*-1);
    }
}
