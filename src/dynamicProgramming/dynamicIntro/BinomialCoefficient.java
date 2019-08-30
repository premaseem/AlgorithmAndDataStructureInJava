package dynamicProgramming.dynamicIntro;

public class BinomialCoefficient {
    public static void main(String[] args) {
        System.out.println(binomialCoefficient(6,4));
        System.out.println(binomialCoefficientDP(6,4));
    }

    public static int binomialCoefficient(int n, int k){
        if(n == k || k == 0){
            return 1;
        }
        return binomialCoefficient(n-1,k-1)+ binomialCoefficient(n-1,k);
    }


    public static int binomialCoefficient(int n, int k, int[][] mem){
        if(k == 0 || n == k) return 1;
        if(mem[n][k] != 0){
            return mem[n][k];
        }
        int res =  binomialCoefficient(n-1,k-1,mem)+ binomialCoefficient(n-1,k,mem);
        mem[n][k]=res;
        return res;
    }

    public static int binomialCoefficientDP(int n, int k){
        int[][] dp = new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
            if(i<=k){
                dp[i][i]=1;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
            }
        }
        return dp[n][k];
    }
}
