package dynamicProgramming.oneDimmensionalDynamic;

import dynamicProgramming.twoDimmensionalDynamic.StopWatch;

import java.util.Arrays;

public class RodCutting {

    public static void main(String[] args) {
        int[] prices = {1, 5, 8, 9, 10, 13, 17, 20, 24, 30};
        StopWatch.start();
        System.out.println(maxProfit(6, prices));
        System.out.println(maxProfit(8, prices));
        System.out.println("Recursive : " + StopWatch.stop() + " nano seconds");

        StopWatch.start();
        System.out.println(maxProfitMemo(6, prices));
        System.out.println(maxProfitMemo(8, prices));
        System.out.println("Memoization : " + StopWatch.stop() + " nano seconds");

        StopWatch.start();
        System.out.println(maxProfitDP(6, prices));
        System.out.println(maxProfitDP(8, prices));
        System.out.println("Bottom up : " + StopWatch.stop() + " nano seconds");

        System.out.println(maxProfitDPReconstruct(8, prices));
    }

    public static int maxProfit(int l, int[] p) {
        if (l == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l; i++) {
            max = Math.max(max, p[i] + maxProfit(l - i - 1, p));
        }
        return max;
    }

    public static int maxProfitMemo(int l, int[] prices) {
        int[] cache = new int[l + 1];
        Arrays.fill(cache, -1);
        return maxProfitMemo(l, prices, cache);
    }

    public static int maxProfitMemo(int l, int[] p, int[] cache) {
        if (l == 0) {
            return 0;
        }
        if (cache[l] != -1) {
            return cache[l];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l; i++) {
            max = Math.max(max, p[i] + maxProfitMemo(l - i - 1, p, cache));
        }
        cache[l] = max;
        return max;
    }

    public static int maxProfitDP(int L, int[] p) {
        int[] dp = new int[L + 1];
        for (int l = 1; l <= L; l++) {
            dp[l] = Integer.MIN_VALUE;
            for (int i = 0; i < l; i++) {
                dp[l] = Math.max(dp[l], p[i] + dp[l - i - 1]);
            }
        }
        return dp[L];
    }

    public static int maxProfitDPReconstruct(int L, int[] p) {
        int[] dp = new int[L + 1];
        int[] cuts = new int[L + 1];
        for (int l = 1; l <= L; l++) {
            dp[l] = Integer.MIN_VALUE;
            int cut = -1;
            for (int i = 0; i < l; i++) {
                if (p[i] + dp[l - i - 1] > dp[l]) {
                    dp[l] = p[i] + dp[l - i - 1];
                    cut = i + 1;
                }
            }
            cuts[l] = cut;
        }
        int l = L;
        int cut = cuts[L];
        while (cut != 0) {
            System.out.print((cut) + " ");
            l = l - cut;
            cut = cuts[l];
        }
        System.out.println("");
        return dp[L];
    }
}
