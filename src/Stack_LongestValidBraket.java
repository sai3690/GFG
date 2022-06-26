import java.util.Scanner;
import java.util.Stack;

public class Stack_LongestValidBraket {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter a braket you wanted to valid");
        String brk = sc.nextLine();
        Stack<Character> chr = new Stack();
        Stack<Integer> ind = new Stack();
        ind.push(-1);

        for(int i = 0; i<brk.length();i++) {
            char brkchr = brk.charAt(i);
            if(brkchr == '(') {
                chr.push(brkchr);
                ind.push(i);
            }
            else {
                if(!chr.isEmpty() && chr.peek()=='(') {
                    chr.pop();
                    ind.pop();
                    max = Math.max(max, i-ind.peek());
                }
                else {
                    ind.push(i);
                }
            }

        }
        System.out.println(max);
    }


}
