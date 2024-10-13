package premiumTask;

public class Account {
    public  double accountBalance;
    public  int accountNumber;
    public  String accountName;



    public Account(String accountName, int accountNumber, double accountBalance) {
        this.accountBalance=accountBalance;
        this.accountNumber=accountNumber;
        this.accountName=accountName;

   }

//    @Override
//    public static String toString() {
//        return "Account{" +
//                "accountBalance=" + accountBalance +
//                ", accountNumber=" + accountNumber +
//                ", accountName='" + accountName + '\'' +
//                '}';
//        System.out.println(account.toString);
//    }

    public void deposit(double amount){
        if(accountBalance == 0){
            accountBalance += amount;
        }
    }
    public void withdraw(double amount){
        if(accountBalance >= 0){
            accountBalance -= amount;
        }
    }
    public double checkBalance(){
        return accountBalance;
    }
    public  String getAccountName(){
        return accountName;
    }
    public  double getAccountBalance(){
        return accountBalance;
    }

    public static void main(String[] args) {
        Account account = new Account("accountName",7052221,0.00);
        String accountName = account.getAccountName();
        double accountBalance = account.getAccountBalance();
        System.out.println("accountName:"+ accountName);

    }
}
