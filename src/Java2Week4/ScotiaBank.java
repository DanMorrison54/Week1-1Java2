package Java2Week4;

public class ScotiaBank extends Bank {
    private float rate;
ScotiaBank(int amount,float rate){
    super(amount);
    this.rate=rate;
}
ScotiaBank(int amount){
    super(amount);
    this.rate=2.3f;
}
    @Override
    void payFees() {
    setAmount(getAmount()-300);
        System.out.println("you paid 300 dollars in fees your new balance is "+getAmount());

    }

    @Override
    void calcInterest() {
        System.out.println("the interest rate at Scotia Bank is "+ rate+"%");
    }
}
