import util.StopWatch;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] A = {5, 2, 4, 7, 3, 8, 2};
        int n = A.length;
        StopWatch.start();
        System.out.println(lis(n - 1, A));
        System.out.println("Recursive : " + ((double) StopWatch.stop() / 1000) + " micro seconds");

        StopWatch.start();
        System.out.println(lisMemo(A));
        System.out.println("Memoization : " + ((double) StopWatch.stop() / 1000) + " micro seconds");

        StopWatch.start();
        System.out.println(lisDP(A));
        System.out.println("DP : " + ((double) StopWatch.stop() / 1000) + " micro seconds");
    }

    public static int lis(int i, int[] A) {
        if (i == 0) {
            return 1;
        }
        int max = 0;
        for (int j = 0; j < i; j++) {
            int lis = lis(j, A);
            if (A[i] > A[j]) {
                lis += 1;
            }
            max = Math.max(max, lis);
        }
        return max;
    }

    public static int lisMemo(int[] A) {
        int[] cache = new int[A.length];
        return lisMemo(A.length - 1, A, cache);
    }

    public static int lisMemo(int i, int[] A, int[] cache) {
        if (i == 0) {
            return 1;
        }
        if (cache[i] != 0) {
            return cache[i];
        }
        int max = 1;
        for (int j = 0; j < i; j++) {
            int lis = lis(j, A);
            if (A[i] > A[j]) {
                lis += 1;
            }
            max = Math.max(max, lis);
        }
        cache[i] = max;
        return max;
    }

    public static int lisDP(int[] A) {
        int N = A.length;
        int[] dp = new int[N];
        dp[0] = 1;
        for (int i = 1; i < N; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                int lis = dp[j];
                if (A[i] > A[j]) {
                    lis += 1;
                }
                dp[i] = Math.max(dp[i], lis);
            }
        }
        return dp[N - 1];
    }
}
