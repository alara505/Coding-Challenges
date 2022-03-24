package InterviewCodeChallenge;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SumofIntArray {

    public static int[] arr = {1,2,3,4,5};


    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(test1());
        System.out.println(test2());
    }

    public static int test1(){
        int [] arr = {1,2,3,4,5};
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            temp += arr[i];
        }
        return temp / 5;
    }

    public static OptionalDouble test2(){
        int [] arr = {1,2,3,4,5};

        return Arrays.stream(arr).average();

    }

    public static int test(){
        int[] arr = {1,2,3,4,5};
        int temp = 0;
        return Arrays.stream(arr).sum() / 5;
    }
}
