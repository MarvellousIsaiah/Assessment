package chapter4;

    import java.util.Scanner;

    public class LargestNumberFinder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int largest = Integer.MIN_VALUE;
            for (int counter = 0; counter < 10; counter++) {

                System.out.println("Enter number " + (counter + 1) + ":");
                int number = scanner.nextInt();

                if (number > largest) {
                    largest = number;
                }
            }

            System.out.println("The largest number is: " + largest);
            scanner.close();
        }
    }


