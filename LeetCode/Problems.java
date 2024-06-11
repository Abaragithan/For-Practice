package Practice.LeetCode;

public class Problems {
    public static void main(String[] args) {



    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray= new int[nums1.length+nums2.length];
        double median;

        for(int i=0; i<nums1.length; i++){
            mergedArray[i] = nums1[i];

        }
        for(int i=0; i<nums2.length; i++){
            mergedArray[nums1.length+i] = nums2[i];
        }
        if(mergedArray.length==1){
            median=mergedArray[0];
            return median;
        }
        if(mergedArray.length==0){
            median=0;
            return median;
        }

        if (nums2.length!=0) {
            int max = nums2[nums2.length-1];

            for (int i = 0; i <mergedArray.length-1 ; i++) {
                for (int j = i+1; j <mergedArray.length; j++) {
                    if(mergedArray[i]>mergedArray[j]){
                        int temp;
                        temp = mergedArray[j];
                        mergedArray[j] = mergedArray[i];
                        mergedArray[i] = temp;
                    }
                }
            }
        }else{
            mergedArray = nums1;
        }
        int l = mergedArray.length-1;
        if(mergedArray.length%2==0){
            median = (double) (mergedArray[l / 2] + mergedArray[(l / 2) + 1]) /2;
        }else{
            median = mergedArray[l/2];
        }
        for (int i = 0; i <mergedArray.length ; i++) {
            System.out.print(mergedArray[i]+",");
        }
        return median;

    }

//        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//            // Ensure nums1 is the smaller array to make the binary search easier
//            if (nums1.length > nums2.length) {
//                return findMedianSortedArrays(nums2, nums1);
//            }
//
//            int m = nums1.length;
//            int n = nums2.length;
//            int imin = 0, imax = m, halfLen = (m + n + 1) / 2;
//            double median = 0.0;
//
//            while (imin <= imax) {
//                int i = (imin + imax) / 2;
//                int j = halfLen - i;
//
//                if (i < m && nums2[j - 1] > nums1[i]) {
//                    // i is too small, must increase it
//                    imin = i + 1;
//                } else if (i > 0 && nums1[i - 1] > nums2[j]) {
//                    // i is too big, must decrease it
//                    imax = i - 1;
//                } else {
//                    // i is perfect
//                    int maxOfLeft;
//                    if (i == 0) {
//                        maxOfLeft = nums2[j - 1];
//                    } else if (j == 0) {
//                        maxOfLeft = nums1[i - 1];
//                    } else {
//                        maxOfLeft = Math.max(nums1[i - 1], nums2[j - 1]);
//                    }
//
//                    if ((m + n) % 2 == 1) {
//                        return maxOfLeft;
//                    }
//
//                    int minOfRight;
//                    if (i == m) {
//                        minOfRight = nums2[j];
//                    } else if (j == n) {
//                        minOfRight = nums1[i];
//                    } else {
//                        minOfRight = Math.min(nums1[i], nums2[j]);
//                    }
//
//                    return (maxOfLeft + minOfRight) / 2.0;
//                }
//            }
//
//            throw new IllegalArgumentException("Input arrays are not sorted or are empty.");
//        }
//    }

}
