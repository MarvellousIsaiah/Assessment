package classes;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("Jane blue", -7.53);


        displayAccount(account1);
        displayAccount(account2);


    }

    private static void displayAccount(Account account1) {
        System.out.println( "the name is "+account1.getName()+"and the balance is "+account1.getBalance());
    }

}
