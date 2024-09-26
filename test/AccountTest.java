import Chapter3.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    void testThatAccountExists(){
        Account account = new Account();
        assertNotNull(account);
    }

    @Test
    void testThatAccountHasAName(){
        Account account = new Account();
        String accountName = "Marvelous";
        account.setName(accountName);
        assertEquals(account.getName(), accountName);
    }

    @Test
    void testThatAccountHasABalance(){
        Account account = new Account();
        assertEquals(account.getBalance(), 0.00);
    }

    @Test
    void testThatAnAmountCanBeDepositedIntoTheAccount(){
        Account account = new Account();
        assertEquals(account.getBalance(), 0.00);
        double depositAmount = 5000.0;
        account.deposit(depositAmount);
        assertEquals(account.getBalance(), depositAmount);
    }

    @Test
    void testThatAmountCanBeWithdrawn(){
        Account account = new Account();
        assertEquals(account.getBalance(), 0.00);
        double depositAmount = 5000.0;
        account.deposit(depositAmount);
        assertEquals(account.getBalance(), depositAmount);
        account.withdraw(2000.00);
        assertEquals(account.getBalance(), 3000.00);
    }

    @Test
    void testThatAmountLessThanOrEqualToZeroCannotBeDeposited(){
        Account account = new Account();
        assertEquals(account.getBalance(), 0.00);
       double depositAmount = -100.00;
      // account.deposit(depositAmount);
        assertThrows(RuntimeException.class, ()-> {
            account.deposit(0);
            assertThrows(RuntimeException.class,()->account.deposit(0.00));
            assertThrows(RuntimeException.class,()->{
                account.deposit(-100);
            });

        });
    }

    @Test
    public void testThatAmountEqualToAccountBalanceCannotBeWithdrawn() {
        Account account = new Account();
        assertEquals(0.00, account.getBalance());

        double depositAmount = 5000.00;
        account.deposit(depositAmount);
        assertEquals(depositAmount, account.getBalance());

        assertThrows(RuntimeException.class, () -> account.withdraw(5000.00));
    }
}
