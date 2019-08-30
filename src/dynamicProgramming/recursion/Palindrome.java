package dynamicProgramming.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String input = "xyyzzpzzyyx";
        System.out.println(isPalindrome(input, 0, input.length() - 1));
    }

    public static boolean isPalindrome(String input, int i, int j) {
        if (i >= j) {
            return true;
        }
        return input.charAt(i) == input.charAt(j) && isPalindrome(input, i + 1, j - 1);
    }
}
