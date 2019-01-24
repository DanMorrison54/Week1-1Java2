package JavaWeek1_2.Java2Assignment1BankAccountsDanielM;

    /**
     *
     * @author Megha
     */
    public class Account {


        private double bal;  //The current balance
        private long accnum;  //The account number


        public Account(int a)
        {
            bal=0.0;
            accnum=a;
        }
        public Account(){

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

        public double getBalance()
        {
            return bal;
        }

        public double getAccountNumber()
        {
            return accnum;
        }
        public void setBal(double bal) {
            this.bal = bal;
        }

        public void setAccNum(long accnum) {
            this.accnum = accnum;
        }
    }


