package MockInterviewRP;

public class reverseRp {

    public static String reverseWord = "this is a good word.  This is an even better one.";

    public static void main(String[] args) {
        System.out.println(test());
    }


    public static String test(){
        //first temp variable string array to grab my reverseWord along with split method
        // to create another variable to grab the string and return it
        //for loop to iterate through the length of the string array
        // After that I will create a StringBuilder to grab the string array.
        //Next I will reverse the StringBuilder
        //Next I will add my counter to store that stringbuilder to return a toString and adding a whitespace
        //Lastly, I will then return the counter variable

        String[] x = reverseWord.split(" ");
        String temp = "";
        for(int i= 0; i < x.length; i++){
            StringBuilder sum = new StringBuilder(x[i]);
            sum.reverse();
            temp += sum.toString() + " ";
        }
        return temp;
    }

}
