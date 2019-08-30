package dynamicProgramming.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        permutation(input);
    }

    /**
     * Returns all the permutations of elements of the given array
     * @param input
     */
    public static void permutation(int[] input){
        Arrays.sort(input);
        permutation(input,new ArrayList<>(),new boolean[input.length]);
    }

    /**
     * Returns all the permutations of elements of the given array
     * @param input
     * @param partial contains the partial permutation
     * @param used uses flags to indicate whether or not the element at the given index is used or not
     */
    public static void permutation(int[] input, ArrayList<Integer> partial, boolean[] used) {
        if (partial.size() == input.length) {
            System.out.println(Arrays.toString(partial.toArray()));
            return;
        }
        for (int i = 0; i < input.length; i++) {
            if (!used[i] && !(i > 0 && input[i] == input[i - 1] && !used[i - 1])) {
                used[i] = true;
                partial.add(input[i]);
                permutation(input, partial, used);
                used[i] = false;
                partial.remove(partial.size() - 1);
            }
        }
    }
}
