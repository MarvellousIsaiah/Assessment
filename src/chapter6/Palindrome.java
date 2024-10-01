package chapter6;

import java.util.Scanner;

import static chapter4.Palindromes.isPalindrome;

public class Palindrome {
    public static void palindrome(int number){
        if (isPalindrome(number))
            System.out.println("it is a palindrome");
        else System.out.println("not a palindrome");
    }

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        System.out.println("enter a number");
        int palindrome = input.nextInt();

       palindrome(palindrome);
    }

    }

