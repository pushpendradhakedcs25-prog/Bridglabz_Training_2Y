package Assigmnet3.Java_Array_Level02;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int persons = sc.nextInt();

        double[] weights = new double[persons];
        double[] heights = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];

        for (int i = 0; i < persons; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            weights[i] = sc.nextDouble();

            System.out.print("Enter height of person " + (i + 1) + " in meters: ");
            heights[i] = sc.nextDouble();

            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nPerson\tHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < persons; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            heights[i] + "\t" +
                            weights[i] + "\t" +
                            String.format("%.2f", bmi[i]) + "\t" +
                            status[i]
            );
        }

        sc.close();
    }
}