package works;

import java.util.Scanner;

public class CircleMetrics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a radius of a circle");
        int radius = input.nextInt();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("circumference %.2%n", circumference);
        System.out.printf("diameter %.2%n",diameter);
        System.out.printf("area %.2%n",area);

        //psvm
        //collect input from user
        //prompt user to collect enter a radius of a circle
        // Calculate the circumference =  circumference to 2 * PI * radius
        // calculate the diameter = diameter to 2 * P1 * radius
        // calculate the area = P1 to * radius * radius
        // print (circumference + diameter + area)


    }
}
