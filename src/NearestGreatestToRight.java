import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class NearestGreatestToRight {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Print the number of element you wanted to add");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the number of elements:");
        for(int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Stack <Integer> st = new Stack();
        Vector<Integer> vt = new Vector();

        for(int i=n-1;i>=0;i--) {
            if(st.isEmpty()) {
                vt.add(-1);

            }
            else if(!st.isEmpty()&& arr[i]<st.peek()) {
                vt.add(st.peek());

            }
            else if(!st.isEmpty()&&arr[i]>=st.peek()) {
                while(!st.isEmpty()&&arr[i]>=st.peek()) {
                    st.pop();
                }
                if(st.isEmpty()) {
                    vt.add(-1);

                }
                else {
                    vt.add(st.peek());
                }


            }
            st.push(arr[i]);

        }
        for (int i = vt.size() - 1; i >= 0; i--) {

            // Printing elements of vector after reversing
            System.out.println(vt.get(i));
        }


    }


}
