package Java2Week4;

public class Rbc extends Bank {
    private float rate;
    Rbc(int amount,float rate){
        super(amount);
        this.rate=rate;
    }
    Rbc(int amount){
        super(amount);
        this.rate=1.2F;
    }

    @Override
    void payFees() {
        setAmount(getAmount()-400);
        System.out.println("you paid 400 dollars in fees your new balance is "+getAmount());
    }

    @Override
    void calcInterest() {
        System.out.println("the interest rate at RBC(Royal Bank Of Canada) is "+ rate+"%");
    }
}
