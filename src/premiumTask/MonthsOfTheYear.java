package premiumTask;

import java.util.Scanner;

public class MonthsOfTheYear {
    public static void main(String[] args) {

        System.out.println("enter a number from 1 to 12");
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
        // pseudocode
        //collect input from the user
        //prompt a user to enter any number,
        //then conditional statement, if number is less than  or equal to 3, then print out first quarter,
        // if number is less than or equal to 6, then print out 2 quarter,
        //if number is less than or equal to 9, then print out 3 quarter,
        //then if number is less than or equal to 12, print 4 quarter


    }
}
