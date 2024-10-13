package works;

import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%n", "Number", "Square", "Cube");

        for (int numb = 1; numb <= 10; numb++) {
            int square = numb * numb;
            int cube = numb * numb * numb;
            System.out.printf("%-10d%-10d%-10d%n", numb, square, cube);
        }
    }
   // PRINT "Number", "Square", "Cube" with formatting

   // For numb from 1 tO 10
   // calculate square TO numb * numb
    //calculate cube TO numb * numb * numb
   // PRINT numb, square, cube with formatting



}

           // System.out.println(("%-10s%-10s%-10s%n", "Numb", "Square", "Cube");



