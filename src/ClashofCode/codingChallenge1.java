package ClashofCode;

import java.util.Scanner;

public class codingChallenge1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int t = scnr.nextInt();
        System.out.print("Please enter a number"); //This is only added because Clash of code has automatic input system.
        if(t % 4 == 0){
            System.out.print("Ok");
        }
        else{
            System.out.print("AAAAAAAAAAA!!!");
        }

    }
//    n = int(input())
//
//            # Write an answer using print
//if n % 4:
//    print("Ok")
//else:
//    print("AAAAAAAAAA!!!")
}
