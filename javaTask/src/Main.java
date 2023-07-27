import banking.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Holder Name : ");
        String accountHolderName = scanner.next();
        Account account = new Account();
        account.setAccountHolderName(accountHolderName);
        System.out.println("Enter Account User Name : ");
        String accountUserName = scanner.next();
        account.setAccountUserName(accountUserName + "@bank.com");
        System.out.println("Enter Account password : ");
        String password = scanner.next();
        account.setPassword(password);
        System.out.println("Account Holder Name : " + account.getAccountHolderName());
        System.out.println("Account User Name : " + account.getAccountUserName());
        System.out.println("Account Password : " + account.getPassword());


        BankAccount bankAccount = new BankAccount();
        System.out.println("set account number : ");
        int accountNumber = scanner.nextInt();
        bankAccount.setAccountNumber(accountNumber);
        bankAccount.setAccountHolderName(accountHolderName);
        bankAccount.setBalance(0);
        System.out.println("Account number : " + bankAccount.getAccountNumber());
        System.out.println("Account holder name : " + bankAccount.getAccountHolderName());
        System.out.println("your current Balance = " + bankAccount.getBalance());
        System.out.println("add money to your bank account : ");
        int addMoney = scanner.nextInt();
        bankAccount.depositingMoney(addMoney);
        System.out.println("take money from your bank account : ");
        int takeMoney = scanner.nextInt();
        bankAccount.withdrawingMoney(takeMoney);

        DepositTransaction depositTransaction = new DepositTransaction();
        depositTransaction.performTransaction(addMoney);

        WithdrawTransaction withdrawTransaction = new WithdrawTransaction();
        withdrawTransaction.performTransaction(takeMoney);

        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println("To calculate your balance after adding interest please Enter your balance : ");
        int balance = scanner.nextInt();
        savingsAccount.calculatingInterest(balance);

        CheckingAccount checkingAccount = new CheckingAccount();
        System.out.println("enter check value : ");
        int checkValue = scanner.nextInt();
        checkingAccount.issuingChecks(checkValue);
        scanner.close();


    }
}