import java.util.Scanner;

public class SIXT_QuestionOfSum {


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the number of element you wanted to try:");
        int N = sc.nextInt();
        int M=N;


        int[] arr1 = new int[N];
        System.out.println("Enter the numbers for 1st array");
        for (int i=0;i<N;i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[M];
        System.out.println("Enter the numbers for 2nd array");
        for (int j=0;j<M;j++) {
            arr2[j] = sc.nextInt();
        }

        double    sum= 0;
        double  result=0;
        for(int i=0;i<N;i++){
            result= (arr1[i]*arr2[i])/2.0;
            sum = sum+result;
        }

        System.out.println( sum);


    }

}
