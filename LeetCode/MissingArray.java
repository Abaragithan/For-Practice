package Practice.LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(missing(nums));
    }
    private static List<Integer> missing(int[] nums) {
        int i = 0;
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
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
               ans.add(j + 1);
            }
        }
        return ans;
    }
}
