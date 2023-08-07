package banking;

public class Bank implements BankingSystem {

    @Override
    public void creatingAccounts() {
    }

    @Override
    public void depositingMoney() {

    }

    @Override
    public void withdrawingMoney() {


    }

    @Override
    public void viewingBalances() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.getBalance();
    }
}
