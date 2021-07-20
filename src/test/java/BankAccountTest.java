import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void testGetBalance() {
        BankAccount bankAccount = new BankAccount();
        assertEquals(0, bankAccount.getBalance());
    }
}