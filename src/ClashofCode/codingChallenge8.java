package ClashofCode;

import java.util.Scanner;

public class codingChallenge8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        long sum_odd = 0;
        long sum_even = 0;
        for(long i = 0; i<=n; i++){
            if (i%2==0){
                sum_even+=i;
            }
            else{
                sum_odd+=i;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum_odd);
        System.out.println(sum_even);
    }
}
