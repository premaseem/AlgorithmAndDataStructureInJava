package dynamicProgramming.recursion;

public class DigitsSum {
    public static void main(String[] args) {
        int n = 1234567;
        System.out.println(digitsSum(n));
    }

    public static int digitsSum(int num){
        if(num == 0){
            return 0;
        }
        int digit = num%10;
        return digit+ digitsSum(num/10);
    }
}
