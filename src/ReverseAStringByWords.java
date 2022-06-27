import java.util.Scanner;

public class ReverseAStringByWords {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String you want to reverse");
        String word = sc.nextLine();
        String[] words = word.split(" ");

        String rev=" ";

        for (int i=0;i<words.length;i++) {

            for(int j=words[i].length()-1;j>=0;j--) {

                rev = rev +" "+words[i].charAt(j);

            }
        }


        System.out.println(rev);
    }


}
