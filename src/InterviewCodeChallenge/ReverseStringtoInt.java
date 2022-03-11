package InterviewCodeChallenge;

public class ReverseStringtoInt {
    public static void main(String[] args) {
        String a = "35";
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        int num = Integer.valueOf(b.toString());
        System.out.println(num);


        String x = "54321";
        int num1 = Integer.valueOf(x);
        int reversed = 0;

        while(num1 != 0){
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;

            num1 /= 10;
        }
        System.out.println(reversed);




    }
}
