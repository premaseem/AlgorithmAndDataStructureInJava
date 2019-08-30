package dynamicProgramming.recursion;

public class CheckSequence {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8};
        System.out.println(isInSequence(input,0));
    }

    /**
     * Check if the elements in the input array are in sequence
     * @param input
     * @param index
     * @return
     */
    public static boolean isInSequence(int[] input,int index){
        return index == input.length-1 || (input[index] == input[index+1]-1 && isInSequence(input,index+1));
    }
}
