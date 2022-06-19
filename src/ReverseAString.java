import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey...!! Enter a string that you want to reverse");
        String s = sc.nextLine();
        char[] w = s.toCharArray();
        String reverse="";

        for(int i=w.length-1;i>=0;i--) {
            reverse=reverse+w[i];

        }
        System.out.println(reverse);

    }
}
