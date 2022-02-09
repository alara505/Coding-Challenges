package ClashofCode;

import java.util.Scanner;

public class codingChallenge3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int func = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            func = a * x + b;
            System.out.println(func);
        }
    }
}
