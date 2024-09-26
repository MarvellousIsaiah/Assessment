package chapter5;


import java.util.Scanner;

public class TaxPlan {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double totalExpenses = 0.0;
            double fairTaxRate = 0.23;

            String[] categories = {"housing", "food", "clothing", "transportation", "education", "health care", "vacations"};

            for (String category : categories) {
                System.out.print("Enter your " + category + " expenses: ");
                double expense = scanner.nextDouble();
                totalExpenses += expense;
            }

            double estimatedFairTax = totalExpenses * fairTaxRate;
            System.out.printf("Your estimated FairTax is: $%.2f%n", estimatedFairTax);


        }
    }



