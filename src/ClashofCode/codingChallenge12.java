package ClashofCode;

import java.util.Scanner;

public class codingChallenge12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        word = word.toLowerCase();

        boolean doubleWord = false;
        for (int i = 0; i < word.length()-1; i++) {

            if (word.charAt(i) == word.charAt(i+1)) {
                doubleWord = true;
            }

        }

        if (doubleWord)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
