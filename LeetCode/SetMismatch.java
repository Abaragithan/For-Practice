package Practice.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] ans = new int[2];
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length ; j++) {
            int correct = nums[j] - 1;
            if (nums[j] != j + 1) {
                ans[0] = nums[correct];
                ans[1] = j + 1;
            }
        }
        return ans;
    }
}
