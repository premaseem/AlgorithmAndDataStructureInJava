import util.StopWatch;

public class MinCostPath {
    public static void main(String[] args) {
        int[] C = {0,20,30,40,25,15,20,28};
        StopWatch.start();
        System.out.println(minCost(C,3));
        System.out.println("Recursive : "+((double) StopWatch.stop()/1000)+" micro seconds");

        StopWatch.start();
        System.out.println(minCostMemo(C,3));
        System.out.println("Memoization : "+((double)StopWatch.stop()/1000)+" micro seconds");

        StopWatch.start();
        System.out.println(minCostDP(C,3));
        System.out.println("DP : "+((double)StopWatch.stop()/1000)+" micro seconds");

        minCostDPReconstruct(C,3);
    }

    public static int minCost(int[] C,int X){
        return minCost(C.length-1,C,X);
    }

    public static int minCost(int i,int[] C,int X){
        if(i == 0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int j=1;j<=Math.min(i,X);j++){
            min = Math.min(min,C[i]+minCost(i-j,C,X));
        }
        return min;
    }

    public static int minCostMemo(int[] C,int X){
        int[] cache = new int[C.length];
        return minCostMemo(C.length-1,C,X,cache);
    }

    public static int minCostMemo(int i,int[] C,int X,int[] cache){
        if(i == 0){
            return 0;
        }
        if(cache[i] != 0){
            return cache[i];
        }
        int min = Integer.MAX_VALUE;
        for(int j=1;j<=Math.min(i,X);j++){
            min = Math.min(min,C[i]+minCostMemo(i-j,C,X,cache));
        }
        cache[i] = min;
        return min;
    }

    public static int minCostDP(int[] C,int X){
        int N = C.length;
        int[] dp = new int[N];
        dp[0]=0;
        for(int i=1;i<N;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=1;j<=Math.min(X,i);j++){
                dp[i] = Math.min(dp[i],dp[i-j]+C[i]);
            }
        }
        return dp[N-1];
    }

    public static int minCostDPReconstruct(int[] C,int X){
        int N = C.length;
        int[] dp = new int[N];
        int[] jump = new int[N];
        dp[0]=0;
        for(int i=1;i<N;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=1;j<=Math.min(X,i);j++){
                if(dp[i-j]+C[i] < dp[i]){
                    jump[i] = i-j;
                    dp[i] = dp[i-j]+C[i];
                }
            }
        }
        int i=N-1;
        System.out.print(i+" -> ");
        while(i>0){
            i = jump[i];
            System.out.print(i+" -> ");
        }
        return dp[N-1];
    }
}
