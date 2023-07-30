package banking;

public class WithdrawTransaction extends Transaction {
    @Override
    public void performTransaction(int money) {
        System.out.println("you made a Withdraw Transaction : " + money);
    }
}
