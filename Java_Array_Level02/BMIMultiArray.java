package Assigmnet3.Java_Array_Level02;

import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter height of person " + (i + 1) + " in meters: ");
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nPerson\tWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < number; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            personData[i][0] + "\t" +
                            personData[i][1] + "\t" +
                            String.format("%.2f", personData[i][2]) + "\t" +
                            weightStatus[i]
            );
        }

        sc.close();
    }
}