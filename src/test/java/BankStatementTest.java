import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class BankStatementTest {
    LocalDateTime testDate1 = LocalDateTime.of(2021, Month.JULY, 19, 19, 30, 40);
    LocalDateTime testDate2 = LocalDateTime.of(2021, Month.JULY, 20, 19, 30, 40);
    LocalDateTime testDate3 = LocalDateTime.of(2021, Month.JULY, 21, 19, 30, 40);
    Transaction testTransaction1 = new Transaction(300, true, 500, testDate1);
    Transaction testTransaction2 = new Transaction(300, true, 800, testDate2);
    Transaction testTransaction3 = new Transaction(300, true, 1100, testDate3);

    @Test
    public void testFormatTransaction() {
        BankStatement bankStatement = new BankStatement();
        assertEquals(bankStatement.formatTransaction(testTransaction1), "19/07/2021 || 300.00 || || 500.00");
    }

    @Test
    public void testFormatStatement() {
        BankStatement bankStatement = new BankStatement();
        TransactionHistory transactionHistory = new TransactionHistory();
        transactionHistory.addTransaction(testTransaction1);
        transactionHistory.addTransaction(testTransaction2);
        transactionHistory.addTransaction(testTransaction3);
        assertEquals(bankStatement.formatStatement(transactionHistory), """
                date || credit || debit || balance
                21/07/2021 || 300.00 || || 1100.00
                20/07/2021 || 300.00 || || 800.00
                19/07/2021 || 300.00 || || 500.00
                """);
    }


}