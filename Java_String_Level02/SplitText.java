package Assigmnet3.Java_String_Level02;

import java.util.Scanner;

public class SplitText {

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

    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[wordCount];

        if (wordCount == 1) {
            words[0] = text;
            return words;
        }

        words[0] = text.substring(0, spaceIndexes[0]);

        for (int i = 1; i < wordCount - 1; i++) {
            words[i] = text.substring(spaceIndexes[i - 1] + 1, spaceIndexes[i]);
        }

        words[wordCount - 1] = text.substring(spaceIndexes[wordCount - 2] + 1);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userDefined = splitText(text);
        String[] builtIn = text.split(" ");

        System.out.println("Words using user-defined method:");
        for (String word : userDefined) {
            System.out.println(word);
        }

        System.out.println("Words using split():");
        for (String word : builtIn) {
            System.out.println(word);
        }

        System.out.println("Both results are same: " +
                compareArrays(userDefined, builtIn));

        sc.close();
    }
}
