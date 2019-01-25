package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;


import java.math.BigInteger;

/**
 * @Author Daniel Morrison
 *
 * This program is a simple savings account using Simple Interest to increase the principle (amount in the account) over time.
 */
public class SavingsAccount extends Account {
   private float time; //incase user wants to know how long the account has existed for, i am setting up a time variable. In this program however it is left mostly unused.
    private double rate; // interest rate for the account
// rest of fields inherited from Super (Account class)


    /**
     * @param rate interest rate for savings account
     * @param bal initial balance (or principle investment)
     * @param accNum the account number (this must be 12 digits long)

     * @throws IllegalArgumentException throws exception if balance is less than or equal to zero, as most bank accounts require atleast some initial balance, a above 0 interest rate
     * since this is a savings account, and a account number that is atleast 12 digits long
     */
    SavingsAccount(double rate, double bal,long accNum) throws IllegalArgumentException {
        //accNum>=100000000000L&&accNum<=999999999999L
        if (bal <= 0 || rate <= 0||(accNum>=10000000000L&&accNum<99999999999L)) {
            throw new IllegalArgumentException("balance or rate cannot be less than or equal to zero"); //throwing exception if rate or balance is zero or lower as that would make no sense
        }
        else {
            this.setBal(bal);
            this.time = 0; // starting initial time at zero, saving incase the user would wish to know how long the account has been saved for
            this.rate = rate;
            this.setAccNum(accNum);
        }

    }
    // side note, since from what I can tell the supers withdraw, and deposit classes would work completely fine for this class (as not much is change upon withdraw or deposit) I will not be
    //creating unique ones for this class like i do for CurrentAccount

    /**
     *
     * @param time passes in a time, this is how many periods of payment have passed, in most cases this will update every period, however i pass in an int in-case user wishes to do multiple
     *             payment periods.
     * @throws IllegalArgumentException an exception is thrown if time is less than or equal to zero as their is no point in updating with zero, and a negative time makes no sense.
     */
     void principleWithInterest(int time) throws IllegalArgumentException {
        if (time <= 0)
            throw new IllegalArgumentException("time cannot be less than or equal to zero");
        this.setBal(this.getBalance() * (1 + (rate / 100) * time));
        this.time += time;
    }

    /**
     *
     * @return returns the total amount of time account has existed
     */
    public float getTime() {
        return time;
    }

    /**
     *
     * @return double interest rate, simply gets the interest for the savings account.
     */
    public double getRate() {
        return rate;
    }

    /**
     *
     * @param rate //passing in new interest rate
     * @throws IllegalArgumentException throws exception if rate is <=0 as stated before, a negative or zero rate would make no sense.
     */
    public void setRate(double rate) throws IllegalArgumentException {
        if(rate<=0) throw new IllegalArgumentException("rate cannot be less than or equal to zero");
        this.rate = rate;
    }

    /**
     *
     * @return returns a string, an override of the  java.lang.Object.toString() method, so that when this classes to string is called it returns the account number, balance, and interest rate
     */
    @Override
    public String toString() {
        return "savings account num: "+new BigInteger(Long.toString((getAccountNumber())))+" balance:  balance:"+getBalance()+" interest rate:"+rate;
    }
}

