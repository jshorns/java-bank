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
        assertEquals(1, bankAccount.getTransactionHistory().size());
        assertEquals(400, bankAccount.getTransactionHistory().get(0).amount);
        assertTrue(bankAccount.getTransactionHistory().get(0).deposit);
        bankAccount.deposit(200);
        assertEquals(600, bankAccount.getBalance());
        assertEquals(2, bankAccount.getTransactionHistory().size());
        assertEquals(200, bankAccount.getTransactionHistory().get(1).amount);
        assertTrue(bankAccount.getTransactionHistory().get(1).deposit);

    }

    @Test
    public void testWithdrawal() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(400);
        bankAccount.withdrawal(200);
        assertEquals(200, bankAccount.getBalance());
        assertEquals(2, bankAccount.getTransactionHistory().size());
        assertEquals(200, bankAccount.getTransactionHistory().get(1).amount);
        assertFalse(bankAccount.getTransactionHistory().get(1).deposit);
        bankAccount.withdrawal(100);
        assertEquals(100, bankAccount.getBalance());
        assertEquals(3, bankAccount.getTransactionHistory().size());
        assertEquals(100, bankAccount.getTransactionHistory().get(2).amount);
        assertFalse(bankAccount.getTransactionHistory().get(2).deposit);
    }
}