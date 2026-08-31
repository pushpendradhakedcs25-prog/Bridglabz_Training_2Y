package Assigmnet3.Java_String_Level01;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String text) {
        System.out.println(text.substring(text.length(), 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(text.length(), 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);

        sc.close();
    }
}

