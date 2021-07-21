import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void testGetBalance() {
        BankAccount bankAccount = new BankAccount();
        assertEquals(0, bankAccount.getBalance());
    }
    @Test
    public void testGetTransactionHistory() {
        BankAccount bankAccount = new BankAccount();
        assertIterableEquals(new ArrayList<>(), bankAccount.getTransactionHistory());
    }

    @Test
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(400);
        assertEquals(400, bankAccount.getBalance());
    }

    @Test
    public void testWithdrawal() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(400);
        bankAccount.withdrawal(200);
        assertEquals(200, bankAccount.getBalance());
    }
}