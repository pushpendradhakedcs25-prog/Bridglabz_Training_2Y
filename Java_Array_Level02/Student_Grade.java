package Assigmnet3.Java_Array_Level02;

import java.util.Scanner;

public class Student_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[][] marks = new double[number][3];
        double[] percentages = new double[number];
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextDouble();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
                continue;
            }

            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

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
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t\t" +
                            marks[i][2] + "\t" +
                            String.format("%.2f", percentages[i]) + "\t\t" +
                            grades[i]
            );
        }

        sc.close();
    }
}
