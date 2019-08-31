package dynamicProgramming.twoDimmensionalDynamic;


public class EditDistance {
    public static void main(String[] args) {
        String A = "sitting";
        String B = "kitten";
        StopWatch.start();
        System.out.println(editDistance(A, B));
        System.out.println("Recursive : " + ((double) StopWatch.stop() / 1000) + " micro seconds");

        StopWatch.start();
        System.out.println(editDistanceMemo(A, B));
        System.out.println("Memoization : " + ((double) StopWatch.stop() / 1000) + " micro seconds");

        StopWatch.start();
        System.out.println(editDistanceDp(A, B));
        System.out.println("DP : " + ((double) StopWatch.stop() / 1000) + " micro seconds");

    }

    public static int editDistance(String A, String B) {
        return editDistance(A.length() - 1, B.length() - 1, A, B);
    }

    public static int editDistance(int i, int j, String A, String B) {
        if (i == -1) {
            return j + 1;
        }
        if (j == -1) {
            return i + 1;
        }
        if (A.charAt(i) == B.charAt(j)) {
            return editDistance(i - 1, j - 1, A, B);
        } else {
            return Math.min(editDistance(i, j - 1, A, B),
                    Math.min(editDistance(i - 1, j - 1, A, B),
                            editDistance(i - 1, j, A, B))) + 1;
        }

    }

    public static int editDistanceMemo(String A, String B) {
        int M = A.length();
        int N = B.length();
        int[][] cache = new int[M + 1][N + 1];
        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                cache[i][j] = -1;
            }
        }
        return editDistanceMemo(M - 1, N - 1, A, B, cache);
    }

    public static int editDistanceMemo(int i, int j, String A, String B, int[][] cache) {
        if (i == -1) {
            return j + 1;
        }
        if (j == -1) {
            return i + 1;
        }
        if (cache[i][j] != -1) {
            return cache[i][j];
        }
        if (A.charAt(i) == B.charAt(j)) {
            int ed = editDistance(i - 1, j - 1, A, B);
            cache[i][j] = ed;
            return cache[i][j];
        } else {
            int ed = Math.min(editDistanceMemo(i, j - 1, A, B, cache),
                    Math.min(editDistanceMemo(i, j - 1, A, B, cache),
                            editDistanceMemo(i - 1, j, A, B, cache))) + 1;
            cache[i][j] = ed;
            return ed;
        }

    }

    public static int editDistanceDp(String A, String B) {
        int M = A.length();
        int N = B.length();
        int[][] dp = new int[M + 1][N + 1];
        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
            }
        }
        return dp[M][N];
    }
}
