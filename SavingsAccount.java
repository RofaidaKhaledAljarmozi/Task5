//Write a class SavingsAccount that is similar to the BankAccount class, except that it has an added instance
// variable interest. Supply a constructor that sets both the initial balance and the interest rate. Supply a
// method addInterest (with no explicit parameter) that adds interest to the account. Write a SavingsAccountTester
// class that constructs a savings account with an initial balance of $1,000 and an interest rate of 10 percent.
// Then apply the addInterest method and print the resulting balance. Also compute the expected result by hand and
// print it.
public class SavingsAccount {
    private double balance ,interest;
    public SavingsAccount(double intial_balance)
    {
        balance=intial_balance;
        interest= ((balance*10)/100);
    }
    public void addInterest()
    {
        balance =balance+interest;
    }
    public void GetBalance()
    {
        System.out.println(balance);
    }
}
