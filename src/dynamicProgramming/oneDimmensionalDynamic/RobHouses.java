import util.StopWatch;

public class RobHouses {
    public static void main(String[] args) {
        int[] S = {20,25,30,15,10,5,12,32,25,8,15,18};
        StopWatch.start();
        System.out.println(maxProfit(S));
        long time = StopWatch.stop();
        System.out.println("Recursion "+((double)time)/1000+" micro seconds");

        StopWatch.start();
        System.out.println(maxProfitMemo(S));
        time = StopWatch.stop();
        System.out.println("Memoization "+((double)time)/1000+" micro seconds");


        StopWatch.start();
        System.out.println(maxProfitDP(S));
        time = StopWatch.stop();
        System.out.println("DP "+((double)time)/1000+" micro seconds");

        System.out.println(maxProfitDPReconstruct(S));
    }

    public static int maxProfit(int[] S){
        return maxProfit(S.length-1,S);
    }

    public static int maxProfit(int i,int[] S){
        if(i<0){
            return 0;
        }
        if(i == 0){
            return S[0];
        }
        return Math.max(S[i]+maxProfit(i-2,S),maxProfit(i-1,S));
    }

    public static int maxProfitMemo(int[] S){
        int[] cache = new int[S.length];
        return maxProfitMemo(S.length-1,S,cache);
    }

    public static int maxProfitMemo(int i,int[] S,int[] cache){
        if(i<0){
            return 0;
        }
        if(i == 0){
            return S[0];
        }
        if(cache[i] != 0){
            return cache[i];
        }
        int profit = Math.max(S[i]+maxProfitMemo(i-2,S,cache),maxProfitMemo(i-1,S,cache));
        cache[i] = profit;
        return profit;
    }

    public static int maxProfitDP(int[] S){
        int N = S.length;
        int[] dp = new int[N+1];
        dp[1] = S[0];
        for(int i=2;i<=N;i++){
            dp[i] = Math.max(S[i-1]+dp[i-2],dp[i-1]);
        }
        return dp[N];
    }


    public static int maxProfitDPReconstruct(int[] S){
        int N = S.length;
        int[] dp = new int[N+1];
        boolean[] rob = new boolean[N];
        rob[0]=true;
        dp[1] = S[0];
        for(int i=2;i<=N;i++){
            if(S[i-1]+dp[i-2] > dp[i-1]){
                dp[i] = S[i-1]+dp[i-2];
                rob[i-1] = true;
            }else{
                dp[i] = dp[i-1];
                rob[i-1] = false;
            }
        }
        int i = N-1;
        while(i>=0){
            if(rob[i]){
                System.out.println(i+" "+S[i]);
                i=i-2;
            }else{
                i--;
            }
        }
        return dp[N];
    }
}
