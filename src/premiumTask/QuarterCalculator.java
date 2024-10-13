package premiumTask;

    import java.util.Scanner;

    public class QuarterCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int month = 0;

            while (true) {
                System.out.print("Enter a month (1-12): ");
                if (scanner.hasNextInt()) {
                    month = scanner.nextInt();
                    if (month >= 1 && month <= 12) {
                        break;
                    } else {
                        System.out.println("Invalid month. Please enter a number between 1 and 12.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 12.");

                }
            }


            int quarter = findQuarter(month);
            System.out.println("The month " + month + " is in the " + quarter + " quarter of the year.");

        }
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
            //the main method
            //create a new object of scanner
            //initialize month variable
            //Input Validation Loop: Continuously prompt the user to enter a valid month (1-12)
            // check if the input is an integer, check if it is within the valid range.
            //check If not valid, print an error message and prompt again.
            // Call the findQuarter function with the valid month.
            // Print the quarter of the year equals to the entered month.
            //
            // Takes an integer month as input.
            // Check the range of the month and return the equals to the quarter:
            //Months 1-3: Return 1st quarter.
            //Months 4-6: Return 2nd quarter.
            //Months 7-9: Return 3rd quarter.
            //Months 10-12: Return 4th quarter.
            //then validate that the user input can be converted to integer before attempting to read it
            // Prompt the user to enter a valid month
        }
    }


