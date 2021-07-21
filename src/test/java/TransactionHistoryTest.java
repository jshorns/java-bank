import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TransactionHistoryTest {

    @Test
    public void testGetTransactions(){
        TransactionHistory transactionHistory = new TransactionHistory();
        assertIterableEquals(new ArrayList<>(), transactionHistory.getTransactions());
    }

    @Test
    public void addTransaction(){
        Transaction transaction = new Transaction(0, true, 0);
        TransactionHistory transactionHistory = new TransactionHistory();
        transactionHistory.addTransaction(transaction);
        assertEquals(1, transactionHistory.getTransactions().size());

    }
}