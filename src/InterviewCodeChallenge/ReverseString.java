package InterviewCodeChallenge;

public class ReverseString {

    public static String word = "So this is something to not worry about but its okay and all good.";

    public static String reverseWord = "This is    so good but   it is also pretty bad";

    public static String reverse = "Hello";

    public static void main(String[] args) {
//        System.out.println(test());
//        System.out.println(reverse());
//        System.out.println(reverse1());
    }


    //This is just reversing the entire sentence
    public static StringBuilder test(){
        StringBuilder string = new StringBuilder(word);
        string.reverse();
        string.toString();
        return string;
    }

    public static String reverse1(){
        String temp = "";
        StringBuilder string = new StringBuilder(reverse);
        string.reverse();
        temp = string.toString();
        return temp;
    }

    //This is to reverse along to check on the whitespaces.
    public static String reverse(){
        String[] x = reverseWord.split(" ");
        String temp = "";

        for(int i = 0; i < x.length; i++){
            StringBuilder sum = new StringBuilder(x[i]);
            sum.reverse();
            temp += sum.toString() + " ";
        }
        if(reverseWord.strip() != ""){
            return temp.trim();
        }
        else
            return reverseWord;
    }
}
