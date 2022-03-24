package InterviewCodeChallenge;

import java.util.*;

public class LinkedList101 {

    private static Map<String, Integer> map = new HashMap<>();

   public static List<Integer> list = new LinkedList<>();


    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(test2());
    }

   public static List<Integer> test(){
       list.add(2000);
       list.add(1);
       list.add(2);
       list.add(3);
       return list;

   }

   private static HashMap test2(){
        map.put("alex", 1);
        map.put("lara", 2);
        return (HashMap) map;
   }

}
