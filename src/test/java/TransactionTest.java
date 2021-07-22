import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;


class TransactionTest {
    LocalDateTime testDate = LocalDateTime.of(2021, Month.JULY, 20, 19, 30, 40);

    @Test
    public void testTransaction() {
        Transaction transaction = new Transaction(300, true, 500, testDate);
        assertEquals(300, transaction.getAmount());
        assertEquals(500, transaction.getBalanceAfter());
        assertTrue(transaction.isDeposit());
        assertEquals(testDate, transaction.getDate());
    }
}