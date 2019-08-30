package dynamicProgramming.recursion;

public class PrintStar {

    public static void main(String[] args){
        int n = 6;
        printPattern(n);
    }

    public static void printPattern(int n){
        printPattern(n,n,true);
    }

    public static void printPattern(int n,int limit,boolean decreasing){
        printStar(n);
        if(n == 1){
            printPattern(n+1,limit,false); // Recursive call
        }else if(n<limit || decreasing){
            printPattern(decreasing ? n-1:n+1,limit,decreasing);
        }
    }

    public static void printStar(int n){
        if(n == 0){
            System.out.println("");
            return;
        }
        System.out.print("* ");
        printStar(n-1);
    }
}
