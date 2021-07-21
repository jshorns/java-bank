import java.util.ArrayList;

public class BankAccount {
    public float balance = 0;
    ArrayList<Transaction> transactionHistory = new ArrayList<>();

    float getBalance() {
        return balance;
    }

    void deposit(float amount) {
        balance += amount;
        Transaction transaction = new Transaction(amount, true);
        transactionHistory.add(transaction);
    }

    void withdrawal(float amount) {
        balance -= amount;
        Transaction transaction = new Transaction(amount, false);
        transactionHistory.add(transaction);
    }

    ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}
