package ClashofCode;

import java.util.Scanner;

public class codingChallenge9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 1; i <= N; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
