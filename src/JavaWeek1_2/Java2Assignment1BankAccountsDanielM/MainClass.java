package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;

import java.util.Random;

public class MainClass {
    public static void main(String[]args) {
     Account acc=new Account((long)( (Math.random() * (999999999999l - 100000000000l + 1))) + 100000000000l);
     Account saveAcc=new SavingsAccount(2.0,1000,(long)( (Math.random() * (999999999999l - 100000000000l + 1))) + 100000000000l);
     Account currAcc=new CurrentAccount(1000,(long)( (Math.random() * (999999999999l - 100000000000l + 1))) + 100000000000l,3000);
     Account[] accounts=new Account[]{acc,saveAcc,currAcc};
     Bank bank=new Bank(accounts);
     bank.update();
    }
}
