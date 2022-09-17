//Suppose you want to implement a class TimeDepositAccount. A time deposit account has a fixed interest rate
// that should be set in the constructor, together with the initial balance. Provide a method to get the current
// balance. Provide a method to add the earned interest to the account. This method should have no arguments because
// the interest rate is already known. It should have no return value because you already provided a method for
// obtaining the current balance. It is not possible to deposit additional funds into this account. Provide a
// withdraw method that removes the entire balance. Partial withdrawals are not allowed.
public class TimeDepositAccount {
    double balance ,rate;
    public TimeDepositAccount(double intial_balance)
    {
        balance=intial_balance;
        rate=((balance*10)/100);
    }
    public double display_balance()
    {
        return balance;
    }
    public void Add_interest()
    {
        balance=balance+rate;
        System.out.println(balance);
    }
    public void withdraw_balance(double newer)
    {
        if(balance==newer)
        {
            balance=balance-balance;
            System.out.println("done");
        }

        else
            System.out.println("sorry ");
    }
    public void deposite_balance(double newer)
    {
        System.out.println("you can not");
    }


}

