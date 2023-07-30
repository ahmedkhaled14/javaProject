package banking;

public class DepositTransaction extends Transaction {

    @Override
    public void performTransaction(int money) {
        System.out.println("you made a Deposit Transaction : " + money);
    }
}
