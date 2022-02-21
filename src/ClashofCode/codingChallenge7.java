package ClashofCode;

import java.util.Scanner;

public class codingChallenge7 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int vowels = 0;
        s = s.toLowerCase();

        for (int i = 1; i < s.length(); i += 2) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowels++;
            }
        }
        System.out.println(vowels);
    }
}
