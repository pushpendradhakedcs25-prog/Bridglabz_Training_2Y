package Assigmnet3.Java_Array_Level02;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percentages = new double[number];
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
            physics[i] = sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            maths[i] = sc.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
                continue;
            }

            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < number; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            physics[i] + "\t" +
                            chemistry[i] + "\t\t" +
                            maths[i] + "\t" +
                            String.format("%.2f", percentages[i]) + "\t\t" +
                            grades[i]
            );
        }

        sc.close();
    }
}