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

}
