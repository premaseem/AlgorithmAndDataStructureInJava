package dynamicProgramming.backtracking;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        anagrams("GOOD");
    }

    public static void anagrams(String input) {
        char[] inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        anagrams(inputArray, new char[input.length()], new boolean[input.length()], 0);
    }

    public static void anagrams(char[] input, char[] anagram, boolean[] used, int index) {
        if (index == input.length) {
            System.out.println(new String(anagram));
            return;
        }
        for (int i = 0; i < input.length; i++) {
            if (!used[i] && !(i > 0 && input[i] == input[i - 1] && !used[i - 1])) {
                used[i] = true;
                anagram[index] = input[i];
                anagrams(input, anagram, used, index + 1);
                used[i] = false;
            }
        }
    }
}
