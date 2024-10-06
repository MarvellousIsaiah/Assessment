package premiumTask;

import java.util.Scanner;

public class CenturyCalculator {
    public static int findCentury(int year) {
        if (year % 100 == 0) {
            return year / 100;
        } else {

            return (year / 100) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        int century = findCentury(year);
        System.out.println("The year " + year + " is in the " + century + " century.");

        //pseudocode
//        FindCentury(year)
//        IF year % 100 == 0 Then
//        Return year /100
//        Else
//        Return (year /100) + 1

//        creat a scanner object that can read user input
//        sout "Enter a year: "
//        Read year from scanner
//        Call findCentury(year)  and store the result in century
//        sout The year " + year + " is in the " + century + " century.

    }
}



