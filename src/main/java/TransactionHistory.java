import java.util.ArrayList;

public class TransactionHistory {
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public ArrayList<Transaction> getTransactions(){
        return this.transactions;
    }

    public void addTransaction(Transaction transaction){
        // ask about this keyword
        // also about mocking/stubbing
        this.transactions.add(transaction);
    }

    public boolean isEmpty(){
        return this.transactions.size() == 0;
    }

    public Transaction getLastTransaction(){
        return this.transactions.get(this.transactions.size() - 1);
    }

}
