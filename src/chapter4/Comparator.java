package chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("enter the second number");
        int num2 = scanner.nextInt();

        if(num1 == num2) {
            System.out.println("0");

        }else if(num1 > num2) {
            System.out.println("1");
        }else {
            System.out.println("-1");

        }


    }




}
