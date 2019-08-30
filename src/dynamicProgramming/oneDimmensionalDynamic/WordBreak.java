import util.StopWatch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
//        String S = "pineapplepenapple";
//        HashSet<String> dictionary = new HashSet<>(Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));

        String S = "aaaaaaaaaaaaaaaaaaaaaaa";
        HashSet<String> dictionary = new HashSet<>(Arrays.asList("a","aaa","aa","aaaa"));
        StopWatch.start();
        System.out.println(countWays(S, dictionary));
        System.out.println("Recursive : "+((double)StopWatch.stop()/1000)+" micro seconds");

        StopWatch.start();
        System.out.println(countWaysMemo(S, dictionary));
        System.out.println("Memoization : "+((double)StopWatch.stop()/1000)+" micro seconds");

        StopWatch.start();
        System.out.println(countWaysDP(S, dictionary));
        System.out.println("DP : "+((double)StopWatch.stop()/1000)+" micro seconds");
    }

    public static int countWays(String S, Set<String> dictionary) {
        return countWays(S.length() - 1, S, dictionary);
    }

    public static int countWays(int i, String S, Set<String> dictionary) {
        if (i == -1) {
            return 1;
        }
        int count = 0;
        for (int j = i; j >= 0; j--) {
            if (dictionary.contains(S.substring(j, i + 1))) {
                count += countWays(j - 1, S, dictionary);
            }
        }
        return count;
    }

    public static int countWaysMemo(String S, Set<String> dictionary) {
        int[] cache = new int[S.length()];
        Arrays.fill(cache, -1);
        return countWaysMemo(S.length() - 1, S, dictionary, cache);
    }

    public static int countWaysMemo(int i, String S, Set<String> dictionary, int[] cache) {
        if (i == -1) {
            return 1;
        }
        if (cache[i] != -1) {
            return cache[i];
        }
        int count = 0;
        for (int j = i; j >= 0; j--) {
            if (dictionary.contains(S.substring(j, i + 1))) {
                count += countWaysMemo(j - 1, S, dictionary, cache);
            }
        }
        cache[i] = count;
        return count;
    }

    public static int countWaysDP(String S,Set<String> dictionary){
        int N = S.length();
        int[] dp = new int[N+1];
        dp[0] = 1;
        for(int i=1;i<=N;i++){
            for(int j=i;j>=1;j--){
                if(dictionary.contains(S.substring(j-1,i))){
                    dp[i]+=dp[j-1];
                }
            }
        }
        return dp[N];
    }

}
