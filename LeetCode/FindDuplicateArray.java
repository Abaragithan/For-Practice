package Practice.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < nums.length){
            int index = nums[i] - 1;
            if (nums[i] != nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != j + 1) {
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}
