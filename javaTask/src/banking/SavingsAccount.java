package banking;

public class SavingsAccount extends Account {


    public void calculatingInterest(int balance) {
        System.out.println("your balance = " + balance + " & your interest = 15 % " + " your balance with interest = " + ((balance * 15) / 100 + balance) + "$");

    }
}
