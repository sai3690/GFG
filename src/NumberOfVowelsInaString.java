import java.util.HashMap;
import java.util.Scanner;

public class NumberOfVowelsInaString {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the String you wanted to add:");
        String name = sc.nextLine();

        char[] chr = name.toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character,Integer>();

        for(int i = 0;i<chr.length;i++) {
            char currcar = name.charAt(i);

            if(currcar=='a'||currcar=='e'||currcar=='i'||currcar=='o'||currcar=='u') {

                if(!map.containsKey(currcar)) {
                    map.put(currcar, 1);
                }else {
                    map.put(currcar, map.get(currcar)+1);
                }
            }


        }
        System.out.println(map);
    }
}
