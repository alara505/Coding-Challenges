package ClashofCode;

import java.util.Scanner;

public class codingChallenge6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int N = in.nextInt();
        int result = 0;


        for(int i = 2; i <= N; i+=2){
            result += i;
        }
        System.out.println(result);
    }
}
