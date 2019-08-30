package dynamicProgramming.twoDimmensionalDynamic;

import util.StopWatch;

import java.util.Arrays;

public class MakePalindrome {
    public static void main(String[] args) {
        StopWatch.start();
        System.out.println(minDeletionsPalindrome("KAZAAKE"));
        System.out.println("Recursive : "+((double)StopWatch.stop()/1000)+" micro seconds");

        StopWatch.start();
        System.out.println(minDeletionsPalindromeMemo("KAZAAKE"));
        System.out.println("Memoization : "+((double)StopWatch.stop()/1000)+" micro seconds");

        StopWatch.start();
        System.out.println(minDeletionsPalindromeDP("KAZAAKE"));
        System.out.println("Memoization : "+((double)StopWatch.stop()/1000)+" micro seconds");
    }

    public static int minDeletionsPalindrome(String s){
        return minDeletionsPalindrome(0,s.length()-1,s);
    }

    public static int minDeletionsPalindrome(int i,int j,String s){
        if(i >= j){
            return 0;
        }
        if(s.charAt(i) == s.charAt(j)){
            return minDeletionsPalindrome(i+1,j-1,s);
        }else{
            return Math.min(minDeletionsPalindrome(i+1,j,s),minDeletionsPalindrome(i,j-1,s))+1;
        }
    }

    public static int minDeletionsPalindromeMemo(String s){
        int N = s.length();
        int[][] cache = new int[N][N];
        for(int[] row : cache){
            Arrays.fill(row,-1);
        }
        return minDeletionsPalindromeMemo(0,s.length()-1,s,cache);
    }

    public static int minDeletionsPalindromeMemo(int i,int j,String s,int[][] cache){
        if(i >= j){
            return 0;
        }
        if(cache[i][j] != -1){
            return cache[i][j];
        }
        if(s.charAt(i) == s.charAt(j)){
            cache[i][j] = minDeletionsPalindrome(i+1,j-1,s);
            return cache[i][j];
        }else{
            cache[i][j] = Math.min(minDeletionsPalindromeMemo(i+1,j,s,cache),minDeletionsPalindromeMemo(i,j-1,s,cache))+1;
            return cache[i][j];
        }
    }

    public static int minDeletionsPalindromeDP(String s){
        int N = s.length();
        int[][] dp = new int[N][N];
        for(int l=1;l<=s.length();l++){
            for(int i=0;i<=N-l;i++){
                int j = i+l-1;
                if(i == j){
                    dp[i][j] = 0;
                    continue;
                }
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j-1])+1;
                }
            }
        }
        return dp[0][N-1];
    }
}
