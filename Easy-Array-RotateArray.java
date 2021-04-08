import java.util.Arrays;

//to update class name in order to use the file

class Solution {
    public void rotate(int[] nums, int k) {
        int [] nums2 = new int [nums.length];
        while (k>nums.length){
            k = k-nums.length;
        }
        for (int i = 0; i<= nums.length-1; i++){
            if (i <= k-1){
                nums2[i] = nums[nums.length-k+i];
                continue;
            }
            nums2[i] = nums[i-k];
        }
        for (int y = 0; y<= nums.length-1; y++) {
            nums[y] = nums2[y];
        }
    }
}
