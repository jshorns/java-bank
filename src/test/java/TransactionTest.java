import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;


class TransactionTest {
    LocalDateTime testDate = LocalDateTime.of(2021, Month.JULY, 20, 19, 30, 40);

    @Test
    public void testTransaction() {
        Transaction transaction = new Transaction(300, true, testDate);
        assertEquals(300, transaction.amount);
        assertTrue(transaction.deposit);
        assertEquals(testDate, transaction.date);
    }
}