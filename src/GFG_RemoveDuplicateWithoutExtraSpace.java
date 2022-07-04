import java.util.Scanner;

public class GFG_RemoveDuplicateWithoutExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element of the array");
        String str = sc.nextLine();
        char[] strch = str.toCharArray();
        String ans = " ";

        for(int i = 0;i<str.length();i++){
            if(!ans.contains(strch[i]+""))
            {
                    ans+=strch[i];
            }
        }

        System.out.println(ans);
    }
}
