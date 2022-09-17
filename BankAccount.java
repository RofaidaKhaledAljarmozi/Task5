//Write a BankAccountTester class whose main method constructs a bank account, deposits $1,000, withdraws $500,
// withdraws another $400, and then prints the remaining balance. Also print the expected result.
//Add a method public void addInterest(double rate) to the BankAccount class that adds interest at the given rate.
// For example, after the statements  BankAccount momsSavings = new BankAccount(1000); momsSavings.addInterest(10);
// 10 percent interest the balance in momsSavings is $1,100. Also supply a BankAccountTester class that prints the
// actual and expected balance.
public class BankAccount {
    private double balance;
    public void Setdeposits(double amount)
    {
        balance = balance + amount;
    }

    public void Setwithdraws(double amount)
    {
        balance = balance - amount;
    }

    public void get_Remaining_Balance()
    {
        System.out.println(balance);
    }

    public void AddInterest()
    {
        double rate = ((balance*10)/100);
        balance=balance+rate;
    }

    public void mystery(BankAccount that, double amount) {
        this.balance = this.balance - amount;
        that.balance = that.balance + amount;

    }
}