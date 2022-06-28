import java.util.Stack;



    import java.util.Stack;

    public class ReverseAStringWithStack {



        public static void main(String[] args) {
            String s = "samarpan";

            Stack stk = new Stack();
            for (int i = 0;i<s.length();i++) {
                stk.push(s.charAt(i));
            }
            System.out.println("After push");
            System.out.println(stk);
            for (int i = 0;i<s.length();i++) {
                System.out.print(stk.pop());
            }

        }


    }

