import java.util.Scanner;
import java.util.Stack;

public class Stack_ValidParentheses {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stk = new Stack();

        System.out.println("enter the bracket you wanted to check");
        String braket = sc.nextLine();
        for(int i =0;i<braket.length();i++) {
            char curr = braket.charAt(i);
            if((curr=='(')||(curr=='{')||(curr=='[')) {
                stk.push(curr);
            }
            else if( (curr==')') && !stk.isEmpty() && stk.peek() == '(' ) {
                stk.pop();
            }
            else if( (curr=='}') && !stk.isEmpty() && stk.peek() == '{' ) {
                stk.pop();
            }
            else if( (curr==']') && !stk.isEmpty() && stk.peek() == '[' ) {
                stk.pop();
            }
        }
        System.out.println(stk.isEmpty());
    }


}
