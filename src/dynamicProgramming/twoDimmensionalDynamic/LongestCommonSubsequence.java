package dynamicProgramming.twoDimmensionalDynamic;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String A = "ACHEFMGLP";
        String B = "XYCEPQMLG";
        StopWatch.start();
        int ret = lcs(A,B);
        System.out.println(ret);
        System.out.println("Recursive : "+((double)StopWatch.stop()/1000)+" micro seconds");

        StopWatch.start();
        ret = lcsMemo(A,B);
        System.out.println(ret);
        System.out.println("Memoization : "+((double)StopWatch.stop()/1000)+" micro seconds");


        StopWatch.start();
        ret = lcsDP(A,B);
        System.out.println(ret);
        System.out.println("DP : "+((double)StopWatch.stop()/1000)+" micro seconds");
    }

    public static int lcs(String A,String B){
        return lcs(A.length()-1,B.length()-1,A,B);
    }

    public static int lcs(int i,int j,String A,String B){
        if(i == -1 || j == -1){
            return 0;
        }
        if(A.charAt(i) == B.charAt(j)){
            return lcs(i-1,j-1,A,B)+1;
        }else {
            return Math.max(lcs(i-1,j,A,B),lcs(i,j-1,A,B));
        }
    }

    public static int lcsMemo(String A,String B){
        int[][] cache = new int[A.length()][B.length()];
        for(int[] row : cache){
            Arrays.fill(row,-1);
        }
        return lcsMemo(A.length()-1,B.length()-1,A,B,cache);
    }

    public static int lcsMemo(int i,int j,String A,String B,int[][] cache){
        if(i == -1 || j == -1){
            return 0;
        }
        if(cache[i][j] != -1){
            return cache[i][j];
        }
        if(A.charAt(i) == B.charAt(j)){
            cache[i][j] = lcsMemo(i-1,j-1,A,B,cache)+1;
            return cache[i][j];
        }else {
            cache[i][j] = Math.max(lcs(i-1,j,A,B),lcsMemo(i,j-1,A,B,cache));
            return cache[i][j];
        }
    }


    public static int lcsDP(String A,String B){
        int M = A.length();
        int N = B.length();
        int[][] dp = new int[M+1][N+1];
        for(int i=1;i<=M;i++){
            for(int j=1;j<=N;j++){
                if(A.charAt(i-1) == B.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[M][N];
    }
}
