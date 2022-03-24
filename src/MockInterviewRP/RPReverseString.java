package MockInterviewRP;

public class RPReverseString {

    public static String reverseString = "This is a good word.  This is an even better one.";

    public static void main(String[] args) {
//        System.out.println(reverse());
        System.out.println(reverse2());

    }


    public static StringBuilder reverse(){
        StringBuilder sum = new StringBuilder(reverseString);
        sum.reverse();
        sum.toString();
        return sum;
    }

    public static String reverse2(){
        //first temp variable string array to grab my reverseString while implementing a split for the whitespace.
        // to create a counter for the temp variable for empty string.
        //for loop to iterate through the length of string.
        //After creating I will create a stringbuilder to grab the array of the string.
        //next I will reverse the string to reverse the entire sentence, but to keep them in place.
        //Next I will add my counter to store that stringbuilder to return a string, which will the stringbuilder to be toString along with
        //adding a whitespace
        //lastly, I will return the counter variable

        String[] x = reverseString.split(" ");
        String temp = "";
        for(int i = 0; i < x.length; i++){
            StringBuilder sum = new StringBuilder(x[i]);
            sum.reverse();
            temp += sum.toString() + " ";
        }
        return temp;
    }
}
