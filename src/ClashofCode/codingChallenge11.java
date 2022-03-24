package ClashofCode;

import java.util.Scanner;

public class codingChallenge11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String hex = in.nextLine();
        String a = hex.substring(2, 4);
        String b = hex.substring(4, 6);
        String c = hex.substring(6, 8);
        String d = hex.substring(8);


        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
