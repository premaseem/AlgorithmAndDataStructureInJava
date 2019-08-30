package dynamicProgramming.twoDimmensionalDynamic;


public class MinimumPathSum {
    public static void main(String[] args) {
        int M = 5;
        int[][] grid = {{0, 47, 8, 18, 1},
                {43, 25, 39, 36, 13},
                {22, 8, 13, 38, 46},
                {41, 41, 40, 25, 44},
                {29, 43, 22, 50, 10}};
        StopWatch.start();
        System.out.println(minPath(M - 1, M - 1, grid));
        System.out.println("Recursion : "+((double)StopWatch.stop()/1000)+" micro seconds");


        StopWatch.start();
        System.out.println(minPathMemo(grid));
        System.out.println("Memoization : "+((double)StopWatch.stop()/1000)+" micro seconds");

        StopWatch.start();
        System.out.println(minPathDP(grid));
        System.out.println("DP : "+((double)StopWatch.stop()/1000)+" micro seconds");
    }


    public static int minPath(int i, int j, int[][] grid) {
        if (i == 0 && j == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        if (i > 0) {
            min = minPath(i - 1, j, grid) + grid[i][j];
        }
        if (j > 0) {
            min = Math.min(min, minPath(i, j - 1, grid) + grid[i][j]);
        }
        return min;
    }

    public static int minPathMemo(int[][] grid){
        int M = grid.length;
        int[][] cache = new int[M][M];
        return minPathMemo(M-1,M-1,grid,cache);
    }


    public static int minPathMemo(int i, int j, int[][] grid,int[][] cache) {
        if (i == 0 && j == 0) {
            return 0;
        }
        if(cache[i][j] != 0){
            return cache[i][j];
        }
        int min = Integer.MAX_VALUE;
        if (i > 0) {
            min = minPathMemo(i - 1, j, grid,cache) + grid[i][j];
        }
        if (j > 0) {
            min = Math.min(min, minPathMemo(i, j - 1, grid,cache) + grid[i][j]);
        }
        cache[i][j]=min;
        return min;
    }

    public static int minPathDP(int[][] G){
        int M = G.length;
        int[][] dp = new int[M][M];
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                if(i==0 && j == 0){
                    continue;
                }
                dp[i][j] = Integer.MAX_VALUE;
                if(i>0){
                    dp[i][j] = dp[i-1][j]+G[i][j];
                }
                if(j>0){
                    dp[i][j] = Math.min(dp[i][j],dp[i][j-1]+G[i][j]);
                }
            }
        }
        return dp[M-1][M-1];
    }
}
