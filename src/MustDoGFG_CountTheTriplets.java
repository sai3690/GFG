import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class MustDoGFG_CountTheTriplets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element of the arra");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers ");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        Collection<Integer> list = new LinkedList<Integer>();


        for (int i=0;i<n;i++) {
            list.add(arr[i]);
        }


        for (int i=0;i<n;i++) {
            if (list.contains(arr[i]+1)) {
                if (list.contains((arr[i]+1)+arr[i])) {
                    System.out.println("Triplates are : "+arr[i]+"+"+(arr[i]+1)+"=="+((arr[i]+1)+arr[i]));
                }
            }
        }


    }

}
