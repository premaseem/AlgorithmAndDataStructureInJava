package codebase2.algo.binarysearch;

public class TestApp {

	public static void main(String[] args) {

		int myArray[] = selectionSort(new int[] {9,8,3,13,87,12,99});
		
		for(int i =0; i < myArray.length; i++){
			System.out.println(myArray[i]);
		}
	}
	
	public static int [] selectionSort(int [] a){
		for(int i=0; i < a.length; i++){
			int minimum = i;
			for(int j = i+1; j < a.length; j++){
				if(a[j] < a[minimum]){ // will only enter here if we find a smaller value
					minimum = j;
				}
			}
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;
		}
		return a;
	}

	
	
	public void doSomeThing(int arg){
		int p = arg;
		int i = 1;
		int j = 1;
		j++;
	}
	
	
	public int showFirst(int arg1, int arg2){
		return arg1+arg2;
	}
	
	public int showFirst(int [] args){
		return args[0];
	}
	
	public int showFirstBad(int [] args){
		
		for(int i = 0; i < args.length; i++){
			int temp = args[i];
		}
		int j = 0;
		return args[0];
	}
	
	public void drive(int miles){
		
	}
	
	
}
