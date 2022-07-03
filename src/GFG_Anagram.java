import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GFG_Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String s1 = sc.nextLine();
        System.out.println("Enter the 2nd String");
        String s2 = sc.nextLine();

        Map<Character,Integer> map1 = new HashMap<Character,Integer>();
        Map<Character,Integer> map2 = new HashMap<Character,Integer>();

       for(int i = 0; i<s1.length();i++){
           if(!map1.containsKey(s1.charAt(i))){
               map1.put(s1.charAt(i),1);
           }
           else{
               map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
           }
       }

        for(int i = 0; i<s2.length();i++){
            if(!map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i),1);
            }
            else{
                map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
            }
        }

        if(map1.equals(map2)){
          System.out.println("True");
        }
        else{
            System.out.println("false");
        }

    }


}
