package Assigmnet3.Java_String_Level02;

import java.util.Scanner;

public class StringLength {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int userDefinedLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using user-defined method: " + userDefinedLength);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}
