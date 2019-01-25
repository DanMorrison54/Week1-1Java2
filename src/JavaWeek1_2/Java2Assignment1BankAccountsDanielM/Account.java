package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;

    /**
     *
     * @author Megha
     */
    public class Account {


        private double bal;  //The current balance
        private long accnum;  //The account number, changed to a long simply to allow more digits (most bank numbers ive seen are 12 digits which is above the threshold supported by int.


         Account(long a)
        {
            bal=0.0;
            accnum=a;
        } // default constructor as I am lazy to call super in every class and pass in an accountNumber.
         Account(){

        }

        public void deposit(double sum)
        {
            if (sum>0)
                bal+=sum;
            else
                System.err.println("Account.deposit(...): "
                        +"cannot deposit negative amount.");
        }

        public void withdraw(double sum)
        {
            if (sum>0)
                bal-=sum;
            else
                System.err.println("Account.withdraw(...): "
                        +"cannot withdraw negative amount.");
        }

         double getBalance()
        {
            return bal;
        }

         long getAccountNumber()
        {
            return accnum;
        }
         void setBal(double bal) { // a setter for balance just to allow inital setup of the balance easier for me in the child classes.
            this.bal = bal;
        }


         void setAccNum(long accnum) { // a setter for accNum for same reasons as the one for balance, makes it easier for me when setting initial values in child classes. The getters i feel are self explainitory
            this.accnum = accnum;
        }
    }


