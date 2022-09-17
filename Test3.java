public class Test3 {
    public static void main(String[] args) {
        BankAccount a=new BankAccount();
        a.Setdeposits(1000);
        a.Setwithdraws(500);
        a.Setwithdraws(400);
        a.get_Remaining_Balance();
        System.out.println("expected result = "+100);
        a.AddInterest();
        a.get_Remaining_Balance();
        System.out.println("expected result = "+200);


    }
}
