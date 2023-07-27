package banking;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    private int addMoney;


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void depositingMoney(int addMoney) {
        this.addMoney = addMoney;
        System.out.println("you have deposited this amount of money : " + addMoney +
                " and your current balance = " + (getBalance() + addMoney));
    }


    public void withdrawingMoney(int takeMoney) {
        if ((getBalance() + this.addMoney) != 0) {
            System.out.println("you have withdrawn this amount of money : " + takeMoney +
                    " ,and your current balance = " + ((getBalance() + this.addMoney) - takeMoney));
        } else {
            System.out.println("your balance is zero You can not withdrawing Money");
        }
    }

}
