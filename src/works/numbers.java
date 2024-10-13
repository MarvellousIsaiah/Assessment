package works;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first integer");
        int number1 = input.nextInt();

        System.out.println("enter second integer");
        int number2 = input.nextInt();

        System.out.println("enter third integer");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int average = sum / 3;
        int product = number1 * number2 * number3;

        int smallest = number1;
        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;

        int largest = number1;
        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Average is %d%n", average);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Smallest is %d%n", smallest);
        System.out.printf("Largest is %d%n", largest);


        //psvm
        //creat a new object of scanner
        //prompt a user to collect input 3times
        //Initialize smallest to number1
        //If number2 is less than smallest
        //    Set smallest to number2
        //If number3 is less than smallest
        //    Set smallest to number3
        //
        //Initialize largest to number1
        //If number2 is greater than largest
        //    Set largest to number2
        //If number3 is greater than largest
        //    Set largest to number3




    }
}
