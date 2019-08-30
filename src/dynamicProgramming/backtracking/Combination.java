package dynamicProgramming.backtracking;

import java.util.Arrays;
import java.util.HashSet;

public class Combination {
    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        int k = 3;
        combination(input,k);
//        combinationAlternative(input,new HashSet<>(),0,k);
    }

    public static void combination(int[] input,int k){
        Arrays.sort(input);
        combination(input,new HashSet<>(),0,k);
    }

    public static void combination(int[] input, HashSet<Integer> set,int start,int k){
        if(set.size() == k){
            System.out.println(set);
            return;
        }
        if(start == input.length){
            return;
        }
        for(int i=start;i<input.length;i++){
            if(i>start && input[i] == input[i-1])
                continue;
            set.add(input[i]);
            combination(input,set,i+1,k);
            set.remove(input[i]);
        }
    }

    public static void combinationAlternative(int[] input,HashSet<Integer> partial,int i,int k){
        if(partial.size() == k){
            System.out.println(Arrays.toString(partial.toArray()));
            return;
        }
        if(i == input.length){
            return;
        }
        partial.add(input[i]);
        combinationAlternative(input,partial,i+1,k);
        partial.remove(input[i]);
        combinationAlternative(input,partial,i+1,k);
    }
}
