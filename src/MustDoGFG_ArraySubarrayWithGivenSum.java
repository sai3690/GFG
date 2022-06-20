import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MustDoGFG_ArraySubarrayWithGivenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element of the array");

        int n = sc.nextInt();
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        Queue<Integer> q= new PriorityQueue<Integer>();
        int sum =0;


        for(int i=0;i<n;i++) {

            if(sum<target) {
                q.add(arr[i]);
                sum = sum+arr[i];
            }
            else if (sum>target) {
                q.remove();

            }

            else if (sum==target) {
                System.out.println(q);
            }

        }


    }
}
