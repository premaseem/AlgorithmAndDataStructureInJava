package dynamicProgramming.dynamicIntro;

public class Fibonacci {
    public static void main(String[] args) {
        int N = 10;
        System.out.println(fib(N));
        System.out.println(fibMemo(N,new int[N+1]));
        System.out.println(fibDP(N));
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibMemo(int n, int[] cache) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (cache[n] != 0) {
            return cache[n];
        }
        int res = fibMemo(n - 1, cache) + fibMemo(n - 2, cache);
        cache[n] = res;
        return res;
    }

    public static int fibDP(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
