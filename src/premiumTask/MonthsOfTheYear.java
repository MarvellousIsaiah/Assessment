package premiumTask;

import java.util.Scanner;

public class MonthsOfTheYear {
    public static void main(String[] args) {

        System.out.println("enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
       //5 System.out.println("firstQuarter");

        if(number <= 3 ){
            System.out.println("firstQuarter");

        }else if(number <= 6){
            System.out.println("secondQuarter");
        } else if(number <= 9){
            System.out.print("thirdQuarter");

        }else if(number <=12 ){
            System.out.println("fourthQuarter");
        }


    }
}
