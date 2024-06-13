package Practice.LeetCode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,6,3,5,2};
        System.out.println(missing(nums));
    }

    private static int missing(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int index = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
}
