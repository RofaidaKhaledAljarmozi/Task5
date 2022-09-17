public class TimeTester {
    public static void main(String[] args) {
        TimeDepositAccount t=new TimeDepositAccount(1000);
        System.out.println(t.display_balance());
        t.Add_interest();
        t.withdraw_balance(1100);
        System.out.println(t.display_balance());
    }
}
