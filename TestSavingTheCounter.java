public class TestSavingTheCounter {
    public static void main(String[] args) {
        SavingsAccount account=new SavingsAccount(1000);
        account.addInterest();
        account.GetBalance();
        System.out.println("expected balance = "+1100);
    }
}
