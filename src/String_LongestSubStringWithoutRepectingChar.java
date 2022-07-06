import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String_LongestSubStringWithoutRepectingChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check");

        String str = sc.nextLine();

        int Result_length =0;
        String Result_String = null;

       Map<Character, Integer> map = new HashMap<Character, Integer>();

       for(int i =0;i<str.length();i++){
           if(!map.containsKey(str.charAt(i))){
               map.put(str.charAt(i),i);
           }
           else{
               i = map.get(str.charAt(i));
               map.clear();
           }

           if(map.size()>Result_length){
               Result_length = map.size();
               Result_String = map.entrySet().toString();

           }
       }

       System.out.println("Longest length is "+ Result_length);
        System.out.println("Longest String is "+ Result_String);
    }
    }
