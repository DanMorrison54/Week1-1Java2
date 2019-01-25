package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;

/**
 * @Author Daniel Morrison
 * class for running the methods specified in the assignment
 */
public class MainClass {
    public static void main(String[] args) {
        // setting the accounts up
        Account acc = new Account((long) ((Math.random() * (999999999999L - 100000000000L + 1))) + 100000000000L);
        Account saveAcc = new SavingsAccount(2.0, 1000, (long) ((Math.random() * (999999999999L - 100000000000L + 1))) + 100000000000L);
        Account currAcc = new CurrentAccount(1000, (long) ((Math.random() * (999999999999L - 100000000000L + 1))) + 100000000000L, 3000);
        Account[] accounts = new Account[]{acc, saveAcc, currAcc}; //adding all accounts to an array then passing to an instance of the Bank Class
        Bank bank = new Bank(accounts);
        accounts=null;// making accounts null as from what I know of the garbage collector this hastens it getting rid of the array (since we are storing it in Bank we no longer need it).
        bank.update();
    }
}
