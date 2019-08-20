package me.premaseem.algorithm.recursion;

public class RecursiveAlgo {


    public void downCounter(int seconds){
        if(seconds != 0) {
            System.out.println("time remaining "+ seconds);
            downCounter(seconds - 1);
        }
    }

    public int factorialWithRecursion(int number) {
        int factorial =1;
        if (number != 1) {
            factorial = number * factorialWithRecursion(number - 1);
        }
        return factorial;
    }

    public int factorialWithLoop(int n){
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public int fibonacciRecursion(int n){
        if (n <= 1){
            return n;
        }
        return fibonacciRecursion(n-1)+ fibonacciRecursion(n-2);

    }

    public int fibonacciWithLoop(int series){
        int arr[] = new int[100];
        arr[0]=0;
        arr[1]=1;
        for(int i=0;i<series;i++){
            arr[i+2] = arr[i]+ arr[i+1];
        }
        return arr[series];
    }

}
