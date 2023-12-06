package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    public void testCreateAccount() {
        Bank bank = new Bank();
        BankAccount account = bank.createAccount("John Doe", 1000);
        assertNotNull(account);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testDeposit() {
        Bank bank = new Bank();
        BankAccount account = bank.createAccount("Alice Smith", 500);
        account.deposit(300);
        assertEquals(800, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        Bank bank = new Bank();
        BankAccount account = bank.createAccount("Bob Johnson", 1000);
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }

    @Test
    public void testTransferMoney() {
        Bank bank = new Bank();
        BankAccount account1 = bank.createAccount("Alice", 1000);
        BankAccount account2 = bank.createAccount("Bob", 500);

        bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), 300);

        assertEquals(700, account1.getBalance());
        assertEquals(800, account2.getBalance());
    }

    @Test
    public void testWithdrawNegativeAmount() {
        Bank bank = new Bank();
        BankAccount account = bank.createAccount("Test", 1000);
        assertThrows(NegativeAmountException.class, () -> account.withdraw(-100));
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        Bank bank = new Bank();
        BankAccount account = bank.createAccount("Test", 1000);
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(2000));
    }

    @Test
    public void testFindAccountNotFound() {
        Bank bank = new Bank();
        assertThrows(AccountNotFoundException.class, () -> bank.findAccount(123));
    }
}
