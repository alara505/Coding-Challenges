package ClashofCode;

import java.util.Scanner;

public class codingChallenge2 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int total = 0;
            for (int i = 0; i < N; i++) {
                int X = in.nextInt();
                total = X + total;
            }
            System.out.print(total);
        }
    }
