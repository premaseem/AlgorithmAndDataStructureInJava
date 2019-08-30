package dynamicProgramming.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        combinationSum(nums, target);
    }

    public static void combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        combinationSum(nums, target, 0, new ArrayList<>(), 0);
    }

    public static void combinationSum(int[] nums, int target, int sum, List<Integer> partial, int start) {
        if (sum == target) {
            System.out.println(Arrays.toString(partial.toArray()));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            int c = nums[i];
            if (sum + c > target || i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            partial.add(c);
            combinationSum(nums, target, sum + c, partial, i + 1);
            partial.remove(partial.size() - 1);
        }
    }
}
