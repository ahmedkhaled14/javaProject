package banking;

public class Account extends BankAccount {
    private String accountUserName;
    private String password;

    public String getAccountUserName() {
        return accountUserName;
    }

    public String getPassword() {
        return password;
    }

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }


    public void setPassword(String password) {
        this.password = password;
    }

}
