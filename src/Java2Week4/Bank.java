package Java2Week4;

abstract class Bank  {
    private int amount;
    Bank(int amount){

        this.amount=amount;
    }
    public void withdraw(int amount){
        this.amount-=amount;
    }
    public void deposit(int amount){
        this.amount+=amount;
    }
    abstract void payFees();
    abstract void calcInterest();

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
