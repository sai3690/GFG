import java.util.Scanner;

public class MustDoGFG_MissingNumber {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element of the array");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers ");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int sum = (n*(n+1))/2;
        int givenSum = 0;


        for (int i=0;i<n;i++) {
            givenSum = givenSum+arr[i];
        }

        System.out.println("Missing number is "+(sum-givenSum));

    }


}
