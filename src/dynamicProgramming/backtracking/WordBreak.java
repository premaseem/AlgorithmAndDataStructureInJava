package dynamicProgramming.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreak {

    public static void main(String[] args){
        HashSet<String> dictionary = new HashSet<>(Arrays.asList("cat","cats","and","sand","dogs"));
        String input = "catsanddogs";
        wordBreak(input,dictionary,new ArrayList<>());
    }

    public static void wordBreak(String input, HashSet<String> dict, List<String> partial){
        if(input.length() == 0){
            System.out.println(Arrays.toString(partial.toArray()));
            return;
        }
        for(int i=0;i<input.length();i++){
            String word = input.substring(0,i+1);
            if(dict.contains(word)){
                partial.add(word);
                wordBreak(input.substring(i+1),dict,partial);
                partial.remove(partial.size()-1);
            }
        }
    }
}
