package Assigmnet3.Java_Array_Level02;

import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int youngest = 0;
        int tallest = 0;

        for (int i = 1; i < friends.length; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }

            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }

        System.out.println("Youngest friend: " + friends[youngest]);
        System.out.println("Tallest friend: " + friends[tallest]);

        sc.close();
    }
}