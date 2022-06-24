import java.util.Scanner;

public class MustDoGFG_ReverseArrayInGroups {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element of the array");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers ");

        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target ");

        int k = sc.nextInt();

        for (int i=0;i<n;i=i+k) {
            int start = i;
            int end = Math.min(i+k-1,n-1);

            while (start <end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end --;
            }
        }

        for (int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }

    }
}
