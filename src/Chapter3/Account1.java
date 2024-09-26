package Chapter3;

public class Account1 {
   private String name;
   private double balance;

   public Account1(String name, double balance){
       this.balance=balance;
       this.name=name;

   }
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return name;
   }
   public void setBalance(int balance){
       this.balance=balance;
   }
   public double getBalance(){
       return balance;
   }
   public void deposit(double depositAmount){
       if (depositAmount > 0.0){
           depositAmount += balance;
       }
   }
}
