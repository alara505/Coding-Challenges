package ClashofCode;

import java.util.Scanner;

public class codingChallenge5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int perfectsqr = 0;


        int count = 1;
        while (perfectsqr < n){
            perfectsqr = count*count;
            count++;
        }
        System.out.println(perfectsqr);
    }
}

