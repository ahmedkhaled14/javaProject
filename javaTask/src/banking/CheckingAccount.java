package banking;

public class CheckingAccount extends Account {
    public void issuingChecks(int money) {
        System.out.println("issuing Check with value : " + money);
    }
}
