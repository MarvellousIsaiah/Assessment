package chapter6;

import static chapter6.PerfectNumbers.MyName;
import static chapter6.PerfectNumbers.perfectNumbers;

public class PrimeNumbers {
    public static String primeNumbers(int number) {
        String prime = " ";
        for (int index = 1; index < number; index++) {
            if (number % index == 0) {
                //  factor = factor + " " + index + ",";
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(MyName);
        perfectNumbers(32);
        System.out.println(PerfectNumbers.sumNumbers(78));
        System.out.println(PerfectNumbers.getFactors(345));
    }
















}