import java.util.ArrayList;

public class BankAccount {
    private float balance;
    private TransactionHistory transactionHistory;

    public BankAccount(){
        this(0, new TransactionHistory());
    }

    public BankAccount(float balance, TransactionHistory transactionHistory){
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    float getBalance() {
        return this.balance;
    }

    void deposit(float amount) {
        // error handling
        this.balance += amount;
        Transaction transaction = new Transaction(amount, true, this.balance);
        transactionHistory.addTransaction(transaction);
    }

    void withdrawal(float amount) throws Exception{
        if ((this.balance - amount) < 0){
            throw new Exception("Insufficient funds.");
        }
        this.balance -= amount;
        Transaction transaction = new Transaction(amount, false, this.balance);
        this.transactionHistory.addTransaction(transaction);
    }

    ArrayList<Transaction> getTransactionHistory() {
        return this.transactionHistory.getTransactions();
    }
}
