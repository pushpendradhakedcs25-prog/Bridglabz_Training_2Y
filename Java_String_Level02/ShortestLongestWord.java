package Assigmnet3.Java_String_Level02;

import java.util.Scanner;

public class ShortestLongestWord {

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

        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                words[wordIndex++] = word;
                start = i + 1;
            }
        }

        return words;
    }

    public static String[][] wordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static int[] findShortestLongest(String[][] words) {
        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < words.length; i++) {
            int currentLength = Integer.parseInt(words[i][1]);
            int shortestLength = Integer.parseInt(words[shortest][1]);
            int longestLength = Integer.parseInt(words[longest][1]);

            if (currentLength < shortestLength) {
                shortest = i;
            }

            if (currentLength > longestLength) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] result = wordLengths(words);

        int[] indexes = findShortestLongest(result);

        System.out.println("Shortest word: " + result[indexes[0]][0]);
        System.out.println("Length: " + result[indexes[0]][1]);

        System.out.println("Longest word: " + result[indexes[1]][0]);
        System.out.println("Length: " + result[indexes[1]][1]);

        sc.close();
    }
}
