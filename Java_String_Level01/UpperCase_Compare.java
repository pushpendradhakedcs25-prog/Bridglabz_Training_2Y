package Assigmnet3.Java_String_Level01;

import java.util.Scanner;

public class UpperCase_Compare {

    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result += ch;
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String userDefined = convertToUpperCase(text);
        String builtIn = text.toUpperCase();

        System.out.println("Uppercase using user-defined method: " + userDefined);
        System.out.println("Uppercase using toUpperCase(): " + builtIn);
        System.out.println("Both results are same: " + compareStrings(userDefined, builtIn));

        sc.close();
    }
}
