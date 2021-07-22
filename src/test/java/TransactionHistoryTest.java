import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
class TransactionHistoryTest {
    @Mock
    Transaction transaction;

    LocalDateTime testDate1 = LocalDateTime.of(2021, Month.JULY, 19, 19, 30, 40);
    LocalDateTime testDate2 = LocalDateTime.of(2021, Month.JULY, 20, 19, 30, 40);
    LocalDateTime testDate3 = LocalDateTime.of(2021, Month.JULY, 21, 19, 30, 40);
    Transaction transaction1 = new Transaction(300, true, 500, testDate1);
    Transaction transaction2 = new Transaction(300, true, 800, testDate2);
    Transaction transaction3 = new Transaction(300, true, 1200, testDate3);

    @Test
    public void testGetTransactions(){
        TransactionHistory transactionHistory = new TransactionHistory();
        assertIterableEquals(new ArrayList<>(), transactionHistory.getTransactions());
    }

    @Test
    public void testAddTransaction(){

        TransactionHistory transactionHistory = new TransactionHistory();
        transactionHistory.addTransaction(transaction);
        assertEquals(1, transactionHistory.getTransactions().size());

    }

    @Test
    public void getLastTransaction(){
        TransactionHistory transactionHistory = new TransactionHistory();
        transactionHistory.addTransaction(transaction);
        assertEquals(transaction, transactionHistory.getLastTransaction());

    }
}