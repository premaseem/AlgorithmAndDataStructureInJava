package dynamicProgramming.dynamicIntro;

import java.util.Arrays;

public class Knapsack {

    public static void main(String[] args) {
        int[] weights = {3, 7, 10, 6};
        int[] values = {4, 14, 10, 5};
        int W = 20;
        int N = weights.length;


        System.out.println(knapsack(weights, values, W, N - 1));
        int[][] dp = new int[W + 1][N + 1];
        for (int i = 0; i <= W; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(knapsackMemo(weights, values, W, N-1, dp));
        System.out.println(knapsackDP(weights, values, W));
        System.out.println(knapsackDPReconstruction(weights, values, W));
    }

    /*
     * Recursive solution
     */
    public static int knapsack(int[] ws, int[] vs, int W, int i) {
        if (i == -1 || W == 0) {
            return 0;
        }
        if (ws[i] <= W) {
            int include = vs[i] + knapsack(ws, vs, W - ws[i], i - 1);
            int exclude = knapsack(ws, vs, W, i - 1);
            return Math.max(include, exclude);
        } else {
            return knapsack(ws, vs, W, i - 1);
        }
    }

    /*
     * Memoization
     */
    public static int knapsackMemo(int[] weights, int[] values, int W, int i, int[][] dp) {
        if (i == -1 || W == 0) {
            return 0;
        }
        if (dp[W][i] != -1) {
            return dp[W][i];
        }
        if (weights[i] <= W) {
            int include = values[i] + knapsack(weights, values, W - weights[i], i - 1);
            int exclude = knapsack(weights, values, W, i - 1);
            dp[W][i] = Math.max(include, exclude);
            return dp[W][i];
        } else {
            return dp[W][i] = knapsack(weights, values, W, i - 1);
        }
    }

    /*
     * Bottom up approach
     */
    public static int knapsackDP(int[] weights, int[] values, int W) {
        int N = weights.length;
        int[][] dp = new int[W + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= W; w++) {
                if (weights[i - 1] <= w) {
                    dp[w][i] = Math.max(dp[w - weights[i - 1]][i - 1] + values[i - 1], dp[w][i - 1]);
                } else {
                    dp[w][i] = dp[w][i - 1];
                }
            }
        }
        return dp[W][N];
    }


    /*
     * Bottom up approach with reconstruction of the solution
     */
    public static int knapsackDPReconstruction(int[] weights, int[] values, int W) {
        int N = weights.length;
        int[][] dp = new int[W + 1][N + 1];
        boolean[][] decisions = new boolean[W + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= W; w++) {
                if (weights[i - 1] <= w) {
                    if (dp[w - weights[i - 1]][i - 1] + values[i - 1] > dp[w][i - 1]) {
                        decisions[w][i] = true;
                        dp[w][i] = dp[w - weights[i - 1]][i - 1] + values[i - 1];
                    } else {
                        dp[w][i] = dp[w][i - 1];
                    }
                } else {
                    dp[w][i] = dp[w][i - 1];
                }
            }
        }
        int i = N;
        int w = W;
        while (i > 0 && w > 0) {
            boolean picked = decisions[w][i];
            if (picked) {
                System.out.println("Picked : " + (i-1) + ", Weight " + weights[i - 1] + ", Value " + values[i - 1]);
                w -= weights[i - 1];
                i--;
            } else {
                i--;
            }
        }
        return dp[W][N];
    }
}
