package dynamicProgramming.dynamicIntro;

import java.util.Arrays;

public class PaintHouse {
    public static final int NONE = -1;
    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int GREEN = 2;

    public static void main(String[] args) {
        int[][] cost = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
        System.out.println(minCost(cost));
        System.out.println(minCostMemo(cost));
        System.out.println(minCostDP(cost));
        System.out.println(minCostDPReconstruct(cost));
    }

    public static int minCost(int[][] cost) {
        int costRed = minCost(cost, 0, RED);
        int costBlue = minCost(cost, 0, BLUE);
        int costGreen = minCost(cost, 0, GREEN);
        return Math.min(costRed, Math.min(costBlue, costGreen));
    }

    public static int minCost(int[][] cost, int i, int color) {
        if (i == cost.length) {
            return 0;
        }
        switch (color) {
            case RED: {
                int costBlue = minCost(cost, i + 1, BLUE);
                int costGreen = minCost(cost, i + 1, GREEN);
                return cost[i][RED] + Math.min(costBlue, costGreen);
            }
            case BLUE: {
                int costRed = minCost(cost, i + 1, RED);
                int costGreen = minCost(cost, i + 1, GREEN);
                return cost[i][BLUE] + Math.min(costRed, costGreen);
            }
            case GREEN: {
                int costRed = minCost(cost, i + 1, RED);
                int costBlue = minCost(cost, i + 1, BLUE);
                return cost[i][GREEN] + Math.min(costRed, costBlue);
            }
        }
        return 0;
    }

    public static int minCostMemo(int[][] cost) {
        int[][] cache = new int[cost.length][cost[0].length];
        for (int[] row : cache) {
            Arrays.fill(row, -1);
        }
        int costRed = minCostMemo(cost, 0, RED, cache);
        int costBlue = minCostMemo(cost, 0, BLUE, cache);
        int costGreen = minCostMemo(cost, 0, GREEN, cache);
        return Math.min(costRed, Math.min(costBlue, costGreen));
    }

    public static int minCostMemo(int[][] cost, int i, int color, int[][] cache) {
        if (i == cost.length) {
            return 0;
        }
        if (cache[i][color] != -1) {
            return cache[i][color];
        }
        switch (color) {
            case RED: {
                int costBlue = minCostMemo(cost, i + 1, BLUE, cache);
                int costGreen = minCostMemo(cost, i + 1, GREEN, cache);
                return cache[i][color] = cost[i][RED] + Math.min(costBlue, costGreen);
            }
            case BLUE: {
                int costRed = minCostMemo(cost, i + 1, RED, cache);
                int costGreen = minCostMemo(cost, i + 1, GREEN, cache);
                return cache[i][color] = cost[i][BLUE] + Math.min(costRed, costGreen);
            }
            case GREEN: {
                int costRed = minCostMemo(cost, i + 1, RED, cache);
                int costBlue = minCostMemo(cost, i + 1, BLUE, cache);
                return cache[i][color] = cost[i][GREEN] + Math.min(costRed, costBlue);
            }
        }
        return 0;
    }

    public static int minCostDP(int[][] costs) {
        int[][] dp = new int[costs.length + 1][3];
        int n = costs.length;
        if (costs.length == 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            dp[i][RED] = costs[i - 1][RED] + Math.min(dp[i - 1][BLUE], dp[i - 1][GREEN]);
            dp[i][BLUE] = costs[i - 1][BLUE] + Math.min(dp[i - 1][RED], dp[i - 1][GREEN]);
            dp[i][GREEN] = costs[i - 1][GREEN] + Math.min(dp[i - 1][RED], dp[i - 1][BLUE]);
        }
        return Math.min(dp[n][RED], Math.min(dp[n][BLUE], dp[n][GREEN]));
    }

    public static int minCostDPReconstruct(int[][] costs) {
        int[][] dp = new int[costs.length + 1][3];
        int[][] decision = new int[costs.length + 1][3];
        int n = costs.length;
        if (costs.length == 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            // RED
            if (dp[i - 1][BLUE] < dp[i - 1][GREEN]) {
                decision[i][RED] = BLUE;
                dp[i][RED] = costs[i - 1][RED] + dp[i - 1][BLUE];
            } else {
                decision[i][RED] = GREEN;
                dp[i][RED] = costs[i - 1][RED] + dp[i - 1][GREEN];
            }

            // BLUE
            if (dp[i - 1][RED] < dp[i - 1][GREEN]) {
                decision[i][BLUE] = RED;
                dp[i][BLUE] = costs[i - 1][BLUE] + dp[i - 1][RED];
            } else {
                decision[i][BLUE] = GREEN;
                dp[i][BLUE] = costs[i - 1][BLUE] + dp[i - 1][GREEN];
            }

            // GREEN
            if (dp[i - 1][RED] < dp[i - 1][BLUE]) {
                decision[i][GREEN] = RED;
                dp[i][GREEN] = costs[i - 1][GREEN] + dp[i - 1][RED];
            } else {
                decision[i][GREEN] = BLUE;
                dp[i][GREEN] = costs[i - 1][GREEN] + dp[i - 1][BLUE];
            }
        }
        int ret = Math.min(dp[n][RED], Math.min(dp[n][BLUE], dp[n][GREEN]));

        // Check which color for the last house resulted in minimal cost
        int color = 0;
        if(ret == dp[n][RED]){
            color = RED;
        }else if(ret == dp[n][BLUE]){
            color = BLUE;
        }else{
            color = GREEN;
        }
        int i=n;
        do{
            System.out.println("House "+(i-1)+" , Paint "+paintColor(decision[i][color])+", Cost "+costs[i-1][color]);
            color = decision[i][color];
            i--;
        }while(i>0);
        return ret;
    }

    public static String paintColor(int color){
        switch (color){
            case RED: return "RED";
            case BLUE: return "BLUE";
            case GREEN: return "GREEN";
        }
        return "";
    }
}
