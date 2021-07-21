import java.util.ArrayList;

public class BankAccount {
    public float balance = 0;
    ArrayList transactionHistory = new ArrayList<>();

    float getBalance() {
        return balance;
    }

    void deposit(float amount) {
        balance += amount;
    }

    void withdrawal(float amount) {
        balance -= amount;
    }

    ArrayList getTransactionHistory() {
        return transactionHistory;
    }
}
