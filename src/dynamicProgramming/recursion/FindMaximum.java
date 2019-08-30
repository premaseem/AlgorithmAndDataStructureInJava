package dynamicProgramming.recursion;

public class FindMaximum {
    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 7, 0, 9, 2};
        System.out.println(maximum(nums));
    }

    public static int maximum(int[] nums) {
        return maximum(nums, nums.length - 1);
    }

    public static int maximum(int[] nums, int i) {
        if (i == 0) {
            return nums[0];
        }
        return Math.max(nums[i], maximum(nums, i - 1));
    }
}
