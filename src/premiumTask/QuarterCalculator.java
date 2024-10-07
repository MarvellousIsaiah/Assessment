package premiumTask;

    import java.util.Scanner;

    public class QuarterCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int month = 0;

            // Prompt the user to enter a valid month
            while (true) {
                System.out.print("Enter a month (1-12): ");
                if (scanner.hasNextInt()) {
                    month = scanner.nextInt();
                    if (month >= 1 && month <= 12) {
                        break; // Valid month entered, exit the loop
                    } else {
                        System.out.println("Invalid month. Please enter a number between 1 and 12.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 12.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // Call the method to determine the quarter
            int quarter = findQuarter(month);
            System.out.println("The month " + month + " is in the " + quarter + " quarter of the year.");

        }

        // Method to determine the quarter of the year
        public static int findQuarter(int month) {
            if (month >= 1 && month <= 3) {
                return 1;
            } else if (month >= 4 && month <= 6) {
                return 2;
            } else if (month >= 7 && month <= 9) {
                return 3;
            } else {
                return 4;
            }
        }
    }

}
