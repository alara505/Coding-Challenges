package ClashofCode;

import java.util.Scanner;

public class codingChallenge4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0;
        c = 180 - (a + b);

        System.out.println(c);
    }
}
