package works;


    import java.util.Scanner;

    public class BodyMass {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter weight (pounds or kilograms): ");
            double weight = input.nextDouble();

            System.out.println("Enter height (inches or meters): ");
            double height = input.nextDouble();

            System.out.println("Is the weight in pounds? (true/false): ");
            boolean isPounds = input.nextBoolean();

            double bmi;

            if (isPounds) {
                bmi = (weight * 703) / (height * height);
            } else {
                bmi = weight / (height * height);
            }

            System.out.printf("Your BMI is: %.2f%n", bmi);
            displayBMICategory(bmi);
        }

        public static void displayBMICategory(double bmi) {
            if (bmi < 18.5) {
                System.out.println("Underweight: BMI is less than 18.5");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.println("Normal weight: BMI is 18.5 to 24.9");
            } else if (bmi >= 25 && bmi < 29.9) {
                System.out.println("Overweight: BMI is 25 to 29.9");
            } else {
                System.out.println("Obesity: BMI is 30 or more");
            }


        }
    }


