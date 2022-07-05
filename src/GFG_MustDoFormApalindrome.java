import java.util.Arrays;

public class GFG_MustDoFormApalindrome {


        static int minPalindrome(String s, int i, int j, int dp[][]){
            if(i >= j){
                return dp[i][j] = 0;

            }
            if(dp[i][j] != -1)return dp[i][j];

            if(s.charAt(i) == s.charAt(j))return dp[i][j] =  minPalindrome(s, i+1, j-1, dp);
            return dp[i][j] =Math.min(1+minPalindrome(s, i+1, j, dp), 1+minPalindrome(s, i, j-1, dp));

        }


        public static int main(String str)
        {
            int dp[][] = new int[str.length()][str.length()];
            for(int i=0; i<str.length(); i++) Arrays.fill(dp[i], -1);
            return minPalindrome(str, 0, str.length()-1, dp);
        }

}
