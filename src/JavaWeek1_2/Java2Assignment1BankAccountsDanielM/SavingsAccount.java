package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;


/**
 * @Author Daniel Morrison
 * This program is a simple savings account using Simple Interest to increase the principle (amount in the account) over time.
 */
public class SavingsAccount extends Account {
    float time;
    double rate;



    /**
     * @param rate
     * @param bal
     *  sets up a new savings account starting at time zero, an interest rate (throws error if interest rate is <=0),
     *  a balance (throws error if balance is <=0) and a account number (throws error if account number isn't a 12 digit number)
     * @throws IllegalArgumentException
     */
    SavingsAccount(double rate, double bal,long accNum) throws IllegalArgumentException {
        if (bal <= 0 || rate <= 0||(accNum>=100000000000L&&accNum<=999999999999L))
            throw new IllegalArgumentException("balance or rate cannot be less than or equal to zero"); //throwing exception if rate or balance is zero or lower as that would make no sense

        else {
            this.setBal(bal);
            this.time = 0;
            this.rate = rate;
            this.setAccNum(accNum);
        }

    }


    public void principleWithInterest(int time) throws IllegalArgumentException {
        if (time <= 0)
            throw new IllegalArgumentException("time cannot be less than or equal to zero");
        this.setBal(this.getBalance() * (1 + (rate / 100) * time));
        this.time += time;
    }


    public float getTime() {
        return time;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

