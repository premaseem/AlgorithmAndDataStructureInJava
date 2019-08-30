package algoBootcamp.algo.recursion;

public class App {

	public static void main(String[] args) {
		System.out.println(recursiveLinearSearch(new int[] {4,48,4,28,34,76,9,3}, 0, 3));

	}
	
	public static void reduceByOne( int n){
		if( n >= 0){
			reduceByOne(n-1);
		}
		
		System.out.println("Completed Call: " + n);
	}

	
	public static int recursiveLinearSearch(int [] a, int i, int x){
		if( i > a.length -1 ){ // if evaluates to true, x was not found in the array
			return -1;
		} else if(a[i] == x){
			return i;
		} else{
			System.out.println("index at: " + i);
			return recursiveLinearSearch(a, i+1, x);
		}
	}
}
