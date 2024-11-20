package PZ1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private static String bankName;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостатньо коштів на рахунку");
        }
    }


    public static void setBankName(String name) {
        bankName = name;
    }


    public static String getBankName() {
        return bankName;
    }

    public void displayAccountInfo() {
        System.out.println("Номер рахунку: " + accountNumber);
        System.out.println("Баланс: " + balance);
        System.out.println("Банк: " + bankName);
    }
}
