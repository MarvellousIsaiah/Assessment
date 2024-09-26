package chapter4;

    import java.util.Scanner;

    public class TaxCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final double TAX_RATE_1 = 0.15;
            final double TAX_RATE_2 = 0.20;
            final double THRESHOLD = 30000.0;

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the name of citizen " + (i + 1) + ":");
                String name = scanner.nextLine();
                System.out.println("Enter the earnings of " + name + ":");
                double earnings = scanner.nextDouble();
                scanner.nextLine();

                double tax;
                if (earnings <= THRESHOLD) {
                    tax = earnings * TAX_RATE_1;
                } else {
                    tax = (THRESHOLD * TAX_RATE_1) + ((earnings - THRESHOLD) * TAX_RATE_2);
                }

                System.out.println("Total tax for " + name + " is: $" + tax);
            }


        }
    }


