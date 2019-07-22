package main.ds.stack;

public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(3);
//		theStack.push(20);
//		theStack.push(40);
//		theStack.push(60);
//		theStack.push(80);
////		
//		while(!theStack.isEmpty()){
//			long value = theStack.pop();
//			System.out.println(value);
//		}
		
		System.out.println(reverseString("Imtiaz"));
	}
	
	public static String reverseString(String str){
		int stackSize = str.length(); // get the max stack size
		Stack theStack = new Stack(stackSize); // we make the stack
		for(int j = 0; j < str.length(); j++){
			char ch = str.charAt(j); // getting a char from the input string
			theStack.push(ch);
		}
		
		String result = "";
		while(!theStack.isEmpty()){
			char ch = theStack.pop();
			result = result+ ch; // appending to the output
		}
		
		return result;
	}

}
