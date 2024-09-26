package Chapter3;

public class AccountTest {
    public static void main(String[] args){
        Account1 account1 = new Account1("Jane Green", 50.00);
        Account1 account12 = new Account1("Jane blue", -7.53);


        displayAccount(account1);
        displayAccount(account12);


    }

    private static void displayAccount(Account1 account1) {
        System.out.println( "the name is "+account1.getName()+"and the balance is "+account1.getBalance());
    }

}
