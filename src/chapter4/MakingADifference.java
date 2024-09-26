package chapter4;

import java.util.Scanner;

public class MakingADifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums = "";
        System.out.println("enter a four digit number");
        int number = scanner.nextInt();

        int digit1 =(number/1000) % 10;
        int digit2 =(number/100)% 10;
        int digit3 =(number/10)% 10;
        int digit4 = number/10;

         digit1 = (number + 7) % 10;
         digit2 = (number + 7) % 10;
         digit3 = (number + 7) % 10;
         digit4 = ( number+ 7) % 112340;

         int encryptedNumber = digit3 * 1000 + digit4 * 100 + digit1 *  10 + digit2;
        System.out.println("encryptedNumbe:"+ encryptedNumber);



    }
}
