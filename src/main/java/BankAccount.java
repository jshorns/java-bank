import java.util.ArrayList;

public class BankAccount {
    // is final right here? IntelliJ suggested it - I guess it does make sense
    // as it's not like a transaction history would ever be replaced.
    private final TransactionHistory transactionHistory;

    public BankAccount(){
        this(new TransactionHistory());
    }

    public BankAccount(TransactionHistory transactionHistory){
        this.transactionHistory = transactionHistory;
    }

    float getBalance() {
        if (this.transactionHistory.isEmpty()){
            return 0;
        }
        return this.transactionHistory.getLastTransaction().getBalanceAfter();
    }

    void deposit(float amount) {
        // error handling - in my ruby version of this I had errors for wrong input type. But obviously in Java
        // that would cause the program to crash anyway. is it preferable to leave this as is, or should those
        // errors be handled?

        float newBalance;
        if (this.transactionHistory.isEmpty()) {
            newBalance = amount;
        } else {
            newBalance = this.transactionHistory.getLastTransaction().getBalanceAfter() + amount;
        }
        Transaction transaction = new Transaction(amount, true, newBalance);
        transactionHistory.addTransaction(transaction);
    }

    void withdrawal(float amount) throws Exception{
        if ((this.getBalance() - amount) < 0){
            throw new Exception("Insufficient funds.");
        }
        float newBalance;
        if (this.transactionHistory.isEmpty()) {
            throw new Exception("You must make a deposit first.");
        }
        newBalance = this.transactionHistory.getLastTransaction().getBalanceAfter() - amount;
        Transaction transaction = new Transaction(amount, false, newBalance);
        this.transactionHistory.addTransaction(transaction);
    }

    ArrayList<Transaction> getTransactionHistory() {
        return this.transactionHistory.getTransactions();
    }
}
